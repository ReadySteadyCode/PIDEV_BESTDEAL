/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Vendeur;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class VendeurDAO {

     private static VendeurDAO vendeurdao;
    private VendeurDAO() {
    }

    public static VendeurDAO getInstance() {
        if (vendeurdao == null) {
            vendeurdao = new VendeurDAO();
        }
        return vendeurdao;
    }
    /**
     * 
     * @param vendeur
     * @return int 0: un problème survient, 1: ajout avec succès
     */

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
    
    /**
     * 
     @param idVendeur
     * @return int 0: un problème survient, 1: ajout avec succès
     */
    
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
    /**
     * 
     * @param vendeur
     * @return int 0: un problème survient, 1: ajout avec succès
     */
    public int updateVendeur (Vendeur vendeur)
    {
        int a=0;
        String sqlrequest = "UPDATE `pi_dev`.`vendeur` SET `nomCommercial`=?, `addresse`=?, `typeBien`=?, `description`=?, `note`=? WHERE `idVendeur`=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setString(1, vendeur.getNomCommercial());
            ps.setString(2, vendeur.getAddresse());
            ps.setString(3, vendeur.getTypeBien());
            ps.setString(4, vendeur.getDescription());
            ps.setInt(5, vendeur.getIdVendeur());
            
            a= ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(VendeurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return a;
    }
    
    /**
     * 
     * @return List<Vendeur>
     */
    public List<Vendeur> displayVendeur ()
    {
        List<Vendeur> vendeurListe = new ArrayList<Vendeur>();
        String sqlrequest = "SELECT idVendeur,nomCommercial FROM pi_dev.vendeur;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ResultSet resultat = ps.executeQuery();
            Vendeur vendeur = new Vendeur();
            while(resultat.next()){
            vendeur.setIdVendeur(resultat.getInt("idVendeur"));
            vendeur.setNomCommercial(resultat.getString("nomCommercial"));
            vendeurListe.add(vendeur);
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendeurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendeurListe;
    }
    public List<Vendeur> displayvendeurByNom(String nomCommercial){
        List<Vendeur> vendeurListe = new ArrayList<Vendeur>();
        String sqlrequest = "SELECT idVendeur FROM pi_dev.vendeur;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ResultSet resultat = ps.executeQuery();
            Vendeur vendeur = new Vendeur();
            while(resultat.next()){
            vendeur.setIdVendeur(resultat.getInt("idVendeur"));
            vendeurListe.add(vendeur);
             }
        } catch (SQLException ex) {
            Logger.getLogger(VendeurDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return vendeurListe;
    }

}
