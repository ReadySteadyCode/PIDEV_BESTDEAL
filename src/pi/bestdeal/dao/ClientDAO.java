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
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class ClientDAO
{

    public ClientDAO() {
    }
        
    public int deleteClient (int idClient)
    {
        int a=0;
      String sqlrequest = "DELETE FROM pi_dev.client WHERE idClient=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idClient);
           a = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
   
}
