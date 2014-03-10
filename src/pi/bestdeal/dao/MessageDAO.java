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
import pi.bestdeal.entities.ClientMail;
import pi.bestdeal.entities.Message;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class MessageDAO {
     private static MessageDAO messagedao;
    private MessageDAO() {
    }

    public static MessageDAO getInstance() {
        if (messagedao == null) {
            messagedao = new MessageDAO();
        }
        return messagedao;
    }

    public List<Message> displayAllMessages()
    {
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

    public List<Message> displayMessagesByClient(int idClient)
    {
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
    
    public List<Message> displayMessagesByStatut(boolean statutLivraison)
    {
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
    
    public int deleteMessage (int idMessage)
    {
         int a=0;
      String sqlrequest = "DELETE FROM pi_dev.message WHERE idMessage=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idMessage);
           a = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
    
    public List<ClientMail> displayMessageWithSenderMail()
    {
        List<ClientMail> msglist = new ArrayList<>();
        String sqlrequest="SELECT client.nom,client.prenom,client.email, message.contenu,message.idMessage FROM pi_dev.client,pi_dev.message where pi_dev.client.idClient=pi_dev.message.idClient;";
         try {
             PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
             ResultSet resultat = ps.executeQuery();
             
             while (resultat.next()){
                 ClientMail clientmail = new ClientMail();
                 clientmail.setNom(resultat.getString("nom"));
                 clientmail.setPrenom(resultat.getString("prenom"));
                 clientmail.setEmail(resultat.getString("email"));
                 clientmail.setContenu(resultat.getString("contenu"));
                 clientmail.setIdMessage(resultat.getInt("idMessage"));
                 msglist.add(clientmail);
             }
         } catch (SQLException ex) {
             Logger.getLogger(MessageDAO.class.getName()).log(Level.SEVERE, null, ex);
         }
         return msglist;
    }

    

    
}
