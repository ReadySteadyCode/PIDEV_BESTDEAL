/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.dao;

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

}
