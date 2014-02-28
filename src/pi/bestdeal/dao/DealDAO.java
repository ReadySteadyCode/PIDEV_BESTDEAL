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
 * @author Ready_Steady_Code
 */
public class DealDAO {
    
    
    private static DealDAO dealdao;
    private DealDAO() {
    }

    public static DealDAO getInstance() {
        if (dealdao == null) {
            dealdao = new DealDAO();
        }
        return dealdao;
    }

    /**
     *
     * @param deal:Deal permet d'effectuer une modification sur les paramètres
     * d'un deal.
     * @return int : 0 si un prblème survient, 1 si la modification s'effectue.
     */
    public int updateStock(Deal deal) {
        String requete = "update deal set titreDeal=?, descDeal=?, prixDeal=?, nbrachatactuel=?, nbrAchatValidation=?,etatDeal=?, StatutDeal=?, dateDebut=?, dateFin=?, nbrAffichage=?, idVendeur=? where idDeal=?";
        int a = 0;
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

    /**
     * Afficher une liste compléte des deals
     *
     * @return List<Deal>
     */
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
                //deal.setPrixDeal_Deal(resultat.getDouble("prixDeal"));
               // deal.setNbrAchatActuelDeal_Deal(resultat.getInt("nbrachatactuel"));
               // deal.setNbrAchatValidation(resultat.getInt("nbrAchatValidation"));
                //deal.setEtatDeal_Deal(resultat.getString("etatDeal"));
               // deal.setStatutDeal_Deal(resultat.getBoolean("StatutDeal"));
                //deal.setDateDebutDeal_Deal(resultat.getDate("dateDebut"));
                //deal.setDateFinDeal_Deal(resultat.getDate("dateFin"));
               // deal.setNbrAffichage_Deal(resultat.getInt("nbrAffichage"));
                //deal.setIdVendeur_Deal(resultat.getInt("idVendeur"));

                dealListe.add(deal);

            }

        } catch (SQLException ex) {
            Logger.getLogger(DealDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dealListe;

    }

    /**
     *
     * @param deal
     * @return int =0 si un problème arrive, 1 si l'opération est effectuée
     */
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
            a = ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }

    /**
     *
     * @param statut : boolean qui indique si un deal est validé ou pas
     * @return List<Deal>
     */
    public List<Deal> displayDealByStatut(boolean statut) {

        List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal where StatutDeal=?";
        PreparedStatement ps;
        try {
            ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setBoolean(1, statut);
            ResultSet resultat = ps.executeQuery(sqlrequest);
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

    /**
     * selection de deals par etat actuel
     *
     * @param etat : en cours , deal passé, deal à venir
     * @return List<Deal>
     */
    public List<Deal> displayDealByEtat(String etat) {

        List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal where etatDeal=?";
        PreparedStatement ps;
        try {
            ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setString(1, etat);
            ResultSet resultat = ps.executeQuery(sqlrequest);
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

    /**
     * utilisé pour ajouter un deal au vendeur par défaut (id = 0)
     *
     * @param deal de type Deal
     * @return int=0 si il y a un problème, 1 si l'ajout est correct
     */
    public int insertDealWithoutVendeur(Deal deal) {
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
            a = ps.executeUpdate();
            System.out.println("Ajout effectuée avec succès");
        } catch (SQLException ex) {
            //Logger.getLogger(PersonneDao.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("erreur lors de l'insertion " + ex.getMessage());
        }
        return a;
    }
    
     public int deleteDeal (int idDeal)
    {
        int a=0;
      String sqlrequest = "DELETE FROM pi_dev.deal WHERE idDeal=?;";
        try {
            PreparedStatement ps = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idDeal);
           a = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }
public List<Deal> displayDealById(int idDeal){
        List<Deal> dealListe = new ArrayList<Deal>();
        String sqlrequest = "SELECT * FROM pi_dev.deal where idDeal=?;";
        try {
         PreparedStatement ps  = MySQLConnection.getInstance().prepareStatement(sqlrequest);
            ps.setInt(1, idDeal);
            ResultSet resultat = ps.executeQuery();
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
   
}
