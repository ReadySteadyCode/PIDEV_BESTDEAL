/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Message;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class MessageDAO {

    public List<Message> displayAllMessages() {
        List<Message> MessageListe = new ArrayList<Message>();
        String sqlrequest = "SELECT * FROM pi_dev.message";
        Statement statement;

        try {
            statement = MySQLConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(sqlrequest);
            while (resultat.next()) {
                Message message = new Message();
                message.setIdMessage(resultat.getInt("idMessage"));
                message.setIdClient(resultat.getInt("idClient"));
                message.setContenu(resultat.getString("contenu"));
                message.setDateEnvoi(resultat.getDate("dateEnvoi"));
                message.setStatutLivraison(resultat.getBoolean("statutLivraison"));

                MessageListe.add(message);
            }
        } catch (SQLException ex) {
                 Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null,"Erreur SQL on displayAllMessages" + ex.getMessage());
        }
        return MessageListe;
    }

    public List<Message> displayMessagesByClient(int idClient) {
        List<Message> MessageListe = new ArrayList<Message>();
        String sqlrequest = "SELECT * FROM pi_dev.message where idClient=?";

        try {

            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idClient);
            ResultSet resultat = ps.executeQuery(sqlrequest);
            while (resultat.next()) {
                Message message = new Message();
                message.setIdMessage(resultat.getInt("idMessage"));
                message.setIdClient(resultat.getInt("idClient"));
                message.setContenu(resultat.getString("contenu"));
                message.setDateEnvoi(resultat.getDate("dateEnvoi"));
                message.setStatutLivraison(resultat.getBoolean("statutLivraison"));

                MessageListe.add(message);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null,"Erreur SQL on displayMessagesByClient" + ex.getMessage());
        }
        return MessageListe;
    }
    
    public List<Message> displayMessagesByStatut(boolean statutLivraison) {
        List<Message> MessageListe = new ArrayList<Message>();
        String sqlrequest = "SELECT * FROM pi_dev.message where statutLivraison=?";

        try {

            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setBoolean(1, statutLivraison);
            ResultSet resultat = ps.executeQuery(sqlrequest);
            while (resultat.next()) {
                Message message = new Message();
                message.setIdMessage(resultat.getInt("idMessage"));
                message.setIdClient(resultat.getInt("idClient"));
                message.setContenu(resultat.getString("contenu"));
                message.setDateEnvoi(resultat.getDate("dateEnvoi"));
                message.setStatutLivraison(resultat.getBoolean("statutLivraison"));

                MessageListe.add(message);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null,"Erreur SQL on displayMessagesByStatut" + ex.getMessage());
        }
        return MessageListe;
    }

    public MessageDAO() {
    }

    
}
