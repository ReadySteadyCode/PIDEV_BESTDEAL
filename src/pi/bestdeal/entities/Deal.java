/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.entities;

import java.util.Date;
import java.util.logging.Logger;

/**
 *
 * @author Internet
 */
public class Deal {

    private int idDeal;
    private String titreDeal;
    private String descDeal;
    private Double prixDeal;
    private int nbrachatactuel;
    private int nbrAchatValidation;
    private String etatDeal;
    private Boolean StatutDeal;
    private Date dateDebut;
    private Date dateFin;
    private String nbrAffichage;
    private int idVendeur;

    public Deal() {
    }

    public Deal(String titreDeal, String descDeal, int nbrachatactuel, int nbrAchatValidation, String etatDeal, Boolean StatutDeal, Date dateFin, String nbrAffichage, int idVendeur) {
        this.titreDeal = titreDeal;
        this.descDeal = descDeal;
        this.nbrachatactuel = nbrachatactuel;
        this.nbrAchatValidation = nbrAchatValidation;
        this.etatDeal = etatDeal;
        this.StatutDeal = StatutDeal;
        this.dateFin = dateFin;
        this.nbrAffichage = nbrAffichage;
        this.idVendeur = idVendeur;
    }
    
    
    

    public int getIdDeal() {
        return idDeal;
    }

    public String getTitreDeal() {
        return titreDeal;
    }

    public String getDescDeal() {
        return descDeal;
    }

    public Double getPrixDeal() {
        return prixDeal;
    }

    public int getNbrachatactuel() {
        return nbrachatactuel;
    }

    public int getNbrAchatValidation() {
        return nbrAchatValidation;
    }

    public String getEtatDeal() {
        return etatDeal;
    }

    public Boolean isStatutDeal() {
        return StatutDeal;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public String getNbrAffichage() {
        return nbrAffichage;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public void setTitreDeal(String titreDeal) {
        this.titreDeal = titreDeal;
    }

    public void setDescDeal(String descDeal) {
        this.descDeal = descDeal;
    }

    public void setPrixDeal(Double prixDeal) {
        this.prixDeal = prixDeal;
    }

    public void setNbrachatactuel(int nbrachatactuel) {
        this.nbrachatactuel = nbrachatactuel;
    }

    public void setNbrAchatValidation(int nbrAchatValidation) {
        this.nbrAchatValidation = nbrAchatValidation;
    }

    public void setEtatDeal(String etatDeal) {
        this.etatDeal = etatDeal;
    }

    public void setStatutDeal(Boolean StatutDeal) {
        this.StatutDeal = StatutDeal;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public void setNbrAffichage(String nbrAffichage) {
        this.nbrAffichage = nbrAffichage;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }
}
