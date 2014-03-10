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
import pi.bestdeal.entities.Deal;
import pi.bestdeal.entities.Reservation;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class ReservationDAO {
  private static ReservationDAO reservationDAO;

    public static ReservationDAO getInstance() {
        if (reservationDAO == null) {
            reservationDAO = new ReservationDAO();
        }
        return reservationDAO;
    }
    public int reservationCounterByGender (Boolean gender,int idDeal){
        int rs=0;
    String sqlrequest="SELECT count( reservation.idClient) as reservation FROM pi_dev.reservation,pi_dev.client where client.idClient=reservation.idClient and client.sexe=? and idDeal=?";
 try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setBoolean(1, gender);
            ps.setInt(2, idDeal);
            ResultSet result = ps.executeQuery();            
           
            while (result.next())
            {
                rs=result.getInt("reservation");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           return rs; 
    }
      public int insertReservation(Reservation reservation) {
        int a = 0;
        String requete = "INSERT INTO `pi_dev`.`reservation` (`statutReservation`, `idClient`, `idDeal`, `dateRerservation`, `dateModification`) VALUES (1, ?, ?, ?, ?);";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setInt(1, reservation.getIdClient());
            ps.setInt(2,reservation.getIdDeal());
            ps.setDate(3, (Date) reservation.getDateRerservation());
            ps.setDate(4, (Date) reservation.getDateModification());
            
           
            a = ps.executeUpdate();
            System.out.println("Ajout réservation effectué avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }
    
}
