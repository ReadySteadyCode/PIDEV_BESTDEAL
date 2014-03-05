/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
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

}
