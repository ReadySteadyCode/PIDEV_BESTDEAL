/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    String sqlrequest="SELECT count(pi_dev.reservation.idReservation) as compteur FROM pi_dev.reservation,pi_dev.Deal where pi_dev.reservation.IdDeal=pi_dev.Deal.idDeal and pi_dev.Deal.idDeal=? and pi_dev.reservation.dateRerservation between ? and ?;";
 try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setBoolean(1, gender);
            ps.setInt(2, idDeal);
            ResultSet result = ps.executeQuery();            
           
            while (result.next())
            {
                rs=result.getInt("compteur");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConsultationDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            
           return rs; 
    }
    
}
