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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Client;
import pi.bestdeal.entities.Deal;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class ClientDAO
{

   private static ClientDAO clientdao;
    private ClientDAO() {
    }

    public static ClientDAO getInstance() {
        if (clientdao == null) {
            clientdao = new ClientDAO();
        }
        return clientdao;}
     
    /**
     * permet de supprimer un client à travers son ID
     * @param idClient : prend un int indiquant l'identifiant du client
     * @return int 0: si un problème survient 1: si la suppression s'effectue
     */
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
    
    /**
     * Permet de lister tous les clients 
     * @return List<Client>
     */
   public List<Client> displayClient ()
   {
       List<Client> clientListe = new ArrayList<Client>();
       String sqlrequest = "SELECT idCLient,nom,prenom,email,nbrSignalisation FROM pi_dev.client where nbrSignalisation>5 ;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ResultSet resultat = ps.executeQuery(sqlrequest);
            while (resultat.next()){
                Client client = new Client();
               
               
                client.setEmail(resultat.getString("email"));
                client.setIdClient(resultat.getInt("idClient"));
                client.setNom(resultat.getString("nom"));
                client.setPrenom(resultat.getString("prenom"));
                client.setNbrSignalisation(resultat.getInt("nbrSignalisation"));
               
                clientListe.add(client);
               
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientListe;
   }
   public int insertClient(Client client) {
        int a = 0;
        String date="";
        String requete = "insert into client (nom, prenom, password, Telephone, email,listedechoix, CIN, datenaissance, sexe, nbrSignalisation) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getPassword());
            ps.setString(4, client.getTelephone());
            ps.setString(5, client.getEmail());
            ps.setString(6, client.getListedechoix());
            ps.setInt(7, client.getCIN());
            date=client.getDatenaissance().toString();
            ps.setDate(8, (Date) client.getDatenaissance());
            ps.setBoolean(9, client.getSexe());
            ps.setInt(10, client.getNbrSignalisation());
          
            a = ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }

}
