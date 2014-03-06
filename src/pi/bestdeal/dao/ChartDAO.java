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
import org.joda.time.DateTime;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class ChartDAO {

    private static ChartDAO dealdao;

    private ChartDAO() {
    }

    public static ChartDAO getInstance() {
        if (dealdao == null) {
            dealdao = new ChartDAO();
        }
        return dealdao;
    }

    public List<Integer> daysvaluesConsultation(String start, String end, int idDeal) {
        List<Integer> listofvalue = new ArrayList<>();
        int a;
        DateTime dateTime = DateTime.parse(start);
        DateTime dateTime1 = DateTime.parse(end);
        while (dateTime.isBefore(dateTime1)) {

            DateTime dateTimeplus = dateTime.plusDays(1);
           // DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");

            
            String sqlrequest = "SELECT count(pi_dev.Consultation.idConsultation) as compteur FROM pi_dev.consultation,pi_dev.Deal where pi_dev.Consultation.IdDeal=pi_dev.Deal.idDeal and pi_dev.Deal.idDeal=? and pi_dev.Consultation.dateCreation between ? and ?;";
            /* DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
             DateTime dateTime = DateTime.parse(start, fmt);
             DateTime dateTime1 = DateTime.parse(end, fmt);*/
            try {
                PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);

                java.sql.Date sqlDate = new java.sql.Date(dateTime.getMillis());
                DateTime d2 = DateTime.parse(end);
                java.sql.Date sqlDate2 = new java.sql.Date(dateTimeplus.getMillis());

                ps.setInt(1, idDeal);
                ps.setDate(2, sqlDate);
                ps.setDate(3, sqlDate2);
                //System.err.println(sqlDate2.toString());

                ResultSet result = ps.executeQuery();

                while (result.next()) {

                    a = result.getInt(1);
                    listofvalue.add(a);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ChartDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            dateTime = dateTime.plusDays(1);
        }
        return listofvalue;
    }
    public List<Integer> daysvaluesReservation(String start, String end, int idDeal) {
        List<Integer> listofvalue = new ArrayList<>();
        int a;
        DateTime dateTime = DateTime.parse(start);
        DateTime dateTime1 = DateTime.parse(end);
        while (dateTime.isBefore(dateTime1)) {

            DateTime dateTimeplus = dateTime.plusDays(1);
           // DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");

            
            String sqlrequest = "SELECT count(pi_dev.Consultation.idConsultation) as compteur FROM pi_dev.consultation,pi_dev.Deal where pi_dev.Consultation.IdDeal=pi_dev.Deal.idDeal and pi_dev.Deal.idDeal=? and pi_dev.Consultation.dateCreation between ? and ?;";
            /* DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd");
             DateTime dateTime = DateTime.parse(start, fmt);
             DateTime dateTime1 = DateTime.parse(end, fmt);*/
            try {
                PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);

                java.sql.Date sqlDate = new java.sql.Date(dateTime.getMillis());
                DateTime d2 = DateTime.parse(end);
                java.sql.Date sqlDate2 = new java.sql.Date(dateTimeplus.getMillis());

                ps.setInt(1, idDeal);
                ps.setDate(2, sqlDate);
                ps.setDate(3, sqlDate2);
                //System.err.println(sqlDate2.toString());

                ResultSet result = ps.executeQuery();

                while (result.next()) {

                    a = result.getInt(1);
                    listofvalue.add(a);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ChartDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            dateTime = dateTime.plusDays(1);
        }
        return listofvalue;
    }
}
