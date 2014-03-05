/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.dao;

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
    
}
