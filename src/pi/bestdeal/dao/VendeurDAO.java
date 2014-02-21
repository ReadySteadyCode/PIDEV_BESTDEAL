/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Vendeur;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class VendeurDAO {

    public VendeurDAO() {
    }

    public int addVendeur(Vendeur vendeur) {
        int a=0;
        String sqlrequest = "INSERT INTO `pi_dev`.`vendeur` (`nomCommercial`, `addresse`, `typeBien`, `description`, `note`) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setString(1, vendeur.getNomCommercial());
            ps.setString(2, vendeur.getAddresse());
            ps.setString(3,vendeur.getTypeBien());
            ps.setString(4, vendeur.getDescription());
            ps.setFloat(5, vendeur.getNote());
            a= ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendeurDAO.class.getName()).log(Level.SEVERE, null,"erreur sur addVendeur"+ ex.getMessage());
        }
        
        return a;
    }
    
    public int deleteVendeur(int idVendeur)
    {
         int a=0;
      String sqlrequest = "DELETE FROM pi_dev.vendeur WHERE idVendeur=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idVendeur);
           a = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

}
