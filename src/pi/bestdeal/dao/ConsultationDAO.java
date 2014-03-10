/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Consultation;
import pi.bestdeal.entities.Reservation;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class ConsultationDAO {

    private static ConsultationDAO consultationDAO;

    public static ConsultationDAO getInstance() {
        if (consultationDAO == null) {
            consultationDAO = new ConsultationDAO();
        }
        return consultationDAO;
    }
 /*   public int insertConsultation (int idDeal,int idClient)
    {
        
    }*/
    public int consultationCounterByGender(Boolean gender,int idDeal)
    {
         int rs=0;
        String sqlrequest = "SELECT count(distinct consultation.idClient) as consultations FROM pi_dev.consultation,pi_dev.client where client.idClient=consultation.idClient and client.sexe=? and idDeal=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setBoolean(1, gender);
            ps.setInt(2, idDeal);
            ResultSet result = ps.executeQuery();            
           
            while (result.next())
            {
                rs=result.getInt("consultations");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           return rs; 
            
    }
     public int insertConsultation(Consultation consultation) {
        int a = 0;
        String date="";
        String requete = "INSERT INTO `pi_dev`.`consultation` (`IdDeal`, `idClient`, `dateCreation`) VALUES (?, ?, ?);";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, consultation.getIdDeal());
            ps.setInt(2,consultation.getIdClient());
             date=consultation.getDateCreation().toString();
           
            ps.setDate(3, (Date) consultation.getDateCreation());
            //ps.setDate(4, (Date) reservation.getDateModification());
            
           
            a = ps.executeUpdate();
            System.out.println("Ajout consultation effectué avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }

}
