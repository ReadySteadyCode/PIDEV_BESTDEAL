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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pi.bestdeal.entities.Deal;
import pi.bestdeal.utils.MySQLConnection;

/**
 *
 * @author Internet
 */
public class DealDAO {

    public int updateStock(Deal deal) {
        String requete = "update deal set titreDeal=?, descDeal=?, prixDeal=?, nbrachatactuel=?, nbrAchatValidation=?,etatDeal=?, StatutDeal=?, dateDebut=?, dateFin=?, nbrAffichage=?, idVendeur=? where idDeal=?";
        int a=0;
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setString(1, deal.getTitreDeal_Deal());
            ps.setString(2, deal.getDescDeal_Deal());
            ps.setDouble(3, deal.getPrixDeal_Deal());
            ps.setInt(4, deal.getNbrAchatActuelDeal_Deal());
            ps.setInt(5, deal.getNbrAchatValidation());
            ps.setString(6, deal.getEtatDeal_Deal());
            ps.setBoolean(7, deal.isStatutDeal());
            ps.setDate(8, (Date) deal.getDateDebutDeal_Deal());
            ps.setDate(9, (Date) deal.getDateFinDeal_Deal());
            ps.setInt(10, deal.getNbrAffichage_Deal());
            ps.setInt(11, deal.getIdVendeur_Deal());
            ps.setInt(12, deal.getIdDeal_Deal());
            a = ps.executeUpdate();
            System.out.println("Mise à jour effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de la mise à jour " + ex.getMessage());
        }
        return a;

    }

    public List<Deal> displayDeal() {
        List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal";
        Statement statement;
        try {
            statement = MySQLConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(sqlrequest);
            while (resultat.next()) {
                Deal deal = new Deal();
                deal.setIdDeal_Deal(resultat.getInt("idDeal"));
                deal.setTitreDeal_Deal(resultat.getString("titreDeal"));
                deal.setDescDeal_Deal(resultat.getString("descDeal"));
                deal.setPrixDeal_Deal(resultat.getDouble("prixDeal"));
                deal.setNbrAchatActuelDeal_Deal(resultat.getInt("nbrachatactuel"));
                deal.setNbrAchatValidation(resultat.getInt("nbrAchatValidation"));
                deal.setEtatDeal_Deal(resultat.getString("etatDeal"));
                deal.setStatutDeal_Deal(resultat.getBoolean("StatutDeal"));
                deal.setDateDebutDeal_Deal(resultat.getDate("dateDebut"));
                deal.setDateFinDeal_Deal(resultat.getDate("dateFin"));
                deal.setNbrAffichage_Deal(resultat.getInt("nbrAffichage"));
                deal.setIdVendeur_Deal(resultat.getInt("idVendeur"));

                dealListe.add(deal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dealListe;

    }
    
    public int insertDeal(Deal deal) {
        int a = 0;
        String requete = "insert into deal (titreDeal, descDeal, prixDeal, nbrachatactuel, nbrAchatValidation,etatDeal, StatutDeal, dateDebut, dateFin, nbrAffichage, idVendeur) values (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setString(1, deal.getTitreDeal_Deal());
            ps.setString(2, deal.getDescDeal_Deal());
            ps.setDouble(3, deal.getPrixDeal_Deal());
            ps.setInt(4, deal.getNbrAchatActuelDeal_Deal());
            ps.setInt(5, deal.getNbrAchatValidation());
            ps.setString(6, deal.getEtatDeal_Deal());
            ps.setBoolean(7, deal.isStatutDeal());
            ps.setDate(8, (Date) deal.getDateDebutDeal_Deal());
            ps.setDate(9, (Date) deal.getDateFinDeal_Deal());
            ps.setInt(10, deal.getNbrAffichage_Deal());
            ps.setInt(11, deal.getIdVendeur_Deal());
            ps.setInt(12, deal.getIdDeal_Deal());
            a= ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }
   
    public List<Deal> displayDealByStatut (boolean statut){
    
    List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal where StatutDeal="+statut;
        Statement statement;
        try {
            statement = MySQLConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(sqlrequest);
            while (resultat.next()) {
                Deal deal = new Deal();
                deal.setIdDeal_Deal(resultat.getInt("idDeal"));
                deal.setTitreDeal_Deal(resultat.getString("titreDeal"));
                deal.setDescDeal_Deal(resultat.getString("descDeal"));
                deal.setPrixDeal_Deal(resultat.getDouble("prixDeal"));
                deal.setNbrAchatActuelDeal_Deal(resultat.getInt("nbrachatactuel"));
                deal.setNbrAchatValidation(resultat.getInt("nbrAchatValidation"));
                deal.setEtatDeal_Deal(resultat.getString("etatDeal"));
                deal.setStatutDeal_Deal(resultat.getBoolean("StatutDeal"));
                deal.setDateDebutDeal_Deal(resultat.getDate("dateDebut"));
                deal.setDateFinDeal_Deal(resultat.getDate("dateFin"));
                deal.setNbrAffichage_Deal(resultat.getInt("nbrAffichage"));
                deal.setIdVendeur_Deal(resultat.getInt("idVendeur"));

                dealListe.add(deal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dealListe;
}
    
    public List<Deal> displayDealByEtat (String etat){
        
    List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal where etatDeal="+etat;
        Statement statement;
        try {
            statement = MySQLConnection.getInstance().createStatement();
            ResultSet resultat = statement.executeQuery(sqlrequest);
            while (resultat.next()) {
                Deal deal = new Deal();
                deal.setIdDeal_Deal(resultat.getInt("idDeal"));
                deal.setTitreDeal_Deal(resultat.getString("titreDeal"));
                deal.setDescDeal_Deal(resultat.getString("descDeal"));
                deal.setPrixDeal_Deal(resultat.getDouble("prixDeal"));
                deal.setNbrAchatActuelDeal_Deal(resultat.getInt("nbrachatactuel"));
                deal.setNbrAchatValidation(resultat.getInt("nbrAchatValidation"));
                deal.setEtatDeal_Deal(resultat.getString("etatDeal"));
                deal.setStatutDeal_Deal(resultat.getBoolean("StatutDeal"));
                deal.setDateDebutDeal_Deal(resultat.getDate("dateDebut"));
                deal.setDateFinDeal_Deal(resultat.getDate("dateFin"));
                deal.setNbrAffichage_Deal(resultat.getInt("nbrAffichage"));
                deal.setIdVendeur_Deal(resultat.getInt("idVendeur"));

                dealListe.add(deal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dealListe;
        
    }
    
    public int insertDealWithoutVendeur(Deal deal)
    {
         int a = 0;
        String requete = "insert into deal (titreDeal, descDeal, prixDeal, nbrachatactuel, nbrAchatValidation,etatDeal, StatutDeal, dateDebut, dateFin, nbrAffichage) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(requete);
            ps.setString(1, deal.getTitreDeal_Deal());
            ps.setString(2, deal.getDescDeal_Deal());
            ps.setDouble(3, deal.getPrixDeal_Deal());
            ps.setInt(4, deal.getNbrAchatActuelDeal_Deal());
            ps.setInt(5, deal.getNbrAchatValidation());
            ps.setString(6, deal.getEtatDeal_Deal());
            ps.setBoolean(7, deal.isStatutDeal());
            ps.setDate(8, (Date) deal.getDateDebutDeal_Deal());
            ps.setDate(9, (Date) deal.getDateFinDeal_Deal());
            ps.setInt(10, deal.getNbrAffichage_Deal());
            ps.setInt(11, deal.getIdVendeur_Deal());
            ps.setInt(12, deal.getIdDeal_Deal());
            a= ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }
    
    
}
