/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import pi.bestdeal.entities.Administrateur;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class AdministrateurDAO {
    
    public void  verification(String login, String password){
    Administrateur adm = new Administrateur();
     String requete = "select login from administrateur  where  login=? and password=?";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setString(1, login);
            ps.setString(2, password);
            
            ResultSet resultat = ps.executeQuery();
            int i=0;
            while (resultat.next())
            {
               adm.setLogin(resultat.getString("login"));
               i++;
            }
            if(i==0)
                JOptionPane.showMessageDialog(null, "verifier login et mot de passe", "Message", JOptionPane.ERROR_MESSAGE);
            else 
                JOptionPane.showMessageDialog(null, "ok c'est ", "Message", JOptionPane.ERROR_MESSAGE);
             
        } catch (SQLException ex) {
           //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la verfication "+ex.getMessage());
            
        }
    }

    public AdministrateurDAO() {
    }
    
    
}

