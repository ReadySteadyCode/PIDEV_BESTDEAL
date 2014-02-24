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
import pi.bestdeal.entities.Rapport;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class RapportDAO {
    public int createRapport(Rapport rapport){
    String sqlrequest="INSERT INTO `pi_dev`.`rapport` (`dateAjout`, `titre`, `contenu`, `dateDebut`, `dateFin`) VALUES (?, ?, ?, ?, ?);";
    int a =0;
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setDate(1, rapport.getDateAjout() );
            ps.setString(2, rapport.getTitre());
            ps.setString(3, rapport.getContenu());
            ps.setDate(4,rapport.getDateDebut());
            ps.setDate(5, rapport.getDateFin());
            a=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RapportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
            }
    
    public int updateRapport (Rapport rapport){
        int a = 0;
        String sqlrequest ="UPDATE `pi_dev`.`rapport` SET `contenu`=? WHERE `idRapport`=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setString(1, rapport.getContenu());
            ps.setInt(2, rapport.getIdRapport());
            a=ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(RapportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
}
    
    public int deleteRapport (int idRapport)
    {
        String sqlrequest = "DELETE FROM `pi_dev`.`rapport` WHERE `idRapport`=?;";
        int a = 0;
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idRapport);
        } catch (SQLException ex) {
            Logger.getLogger(RapportDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

}
