/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.io.ByteArrayInputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.ImageDeal;
import pi.bestdeal.utils.MySQLConnection;


/**
 *
 * @author user
 */
public class ImageDAO {
    
    private static ImageDAO imageDAO;
    public static ImageDAO getInstance(){
        if(imageDAO==null){
            imageDAO = new ImageDAO();
        }
        return imageDAO;
    }
    
    public List<ImageDeal> DisplayAllImage(int id) {
        String requete = "SELECT * FROM pi_dev.dealimage where idDeal=? ;";
        List<ImageDeal> listes = new ArrayList<ImageDeal>();
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, id);
            
            ResultSet resultat = ps.executeQuery();
            
            while (resultat.next()) {
                ImageDeal img = new ImageDeal();
                img.setIdDeal(resultat.getInt("idDealImage"));
                img.setIdDealImage(resultat.getInt("idDeal"));
                Blob b=resultat.getBlob("Image");
                byte[] bb=new byte[(int)b.length()];
                bb=b.getBytes(1,(int) b.length());
                img.setImage(bb);
                listes.add(img);
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        return listes;
    }
    public int InsertImage(ImageDeal img)
    { String reqString="INSERT INTO `pi_dev`.`dealimage` (`idDeal`, `Image`) VALUES (?, ?);";
    int a=0;
        try {
            PreparedStatement ps=MySQLConnection.getInstance().prepareStatement(reqString);
            ps.setInt(1, img.getIdDeal());
            ByteArrayInputStream bis = new ByteArrayInputStream(img.getImage());
            ps.setBinaryStream(2, bis);
           a=ps.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(ImageDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    return a;}
}
