/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.entities;

import java.util.Date;



public class Deal {

    private int idDeal_Deal;
    private String titreDeal_Deal;
    private String descDeal_Deal;
    private Double prixDeal_Deal;
    private int nbrAchatActuel_Deal;
    private int nbrAchatValidation_Deal;
    private String etatDeal_Deal;
    private Boolean statutDeal_Deal;
    private Date dateDebutDeal_Deal;
    private Date dateFinDeal_Deal;
    private int nbrAffichage_Deal;
    private int idVendeur_Deal;

    public Deal() {
    }

    public Deal(String titreDeal, String descDeal, int nbrachatactuel, int nbrAchatValidation, String etatDeal, Boolean StatutDeal, Date dateFin, int nbrAffichage, int idVendeur) {
        this.titreDeal_Deal = titreDeal;
        this.descDeal_Deal = descDeal;
        this.nbrAchatActuel_Deal = nbrachatactuel;
        this.nbrAchatValidation_Deal = nbrAchatValidation;
        this.etatDeal_Deal = etatDeal;
        this.statutDeal_Deal = StatutDeal;
        this.dateFinDeal_Deal = dateFin;
        this.nbrAffichage_Deal = nbrAffichage;
        this.idVendeur_Deal = idVendeur;
    }
    
    
    

    public int getIdDeal_Deal() {
        return idDeal_Deal;
    }

    public String getTitreDeal_Deal() {
        return titreDeal_Deal;
    }

    public String getDescDeal_Deal() {
        return descDeal_Deal;
    }

    public Double getPrixDeal_Deal() {
        return prixDeal_Deal;
    }

    public int getNbrAchatActuelDeal_Deal() {
        return nbrAchatActuel_Deal;
    }

    public int getNbrAchatValidation() {
        return nbrAchatValidation_Deal;
    }

    public String getEtatDeal_Deal() {
        return etatDeal_Deal;
    }

    public Boolean isStatutDeal() {
        return statutDeal_Deal;
    }

    public Date getDateDebutDeal_Deal() {
        return dateDebutDeal_Deal;
    }

    public Date getDateFinDeal_Deal() {
        return dateFinDeal_Deal;
    }

    public int getNbrAffichage_Deal() {
        return nbrAffichage_Deal;
    }

    public int getIdVendeur_Deal() {
        return idVendeur_Deal;
    }

    public void setTitreDeal_Deal(String titreDeal_Deal) {
        this.titreDeal_Deal = titreDeal_Deal;
    }

    public void setDescDeal_Deal(String descDeal_Deal) {
        this.descDeal_Deal = descDeal_Deal;
    }

    public void setPrixDeal_Deal(Double prixDeal_Deal) {
        this.prixDeal_Deal = prixDeal_Deal;
    }

    public void setNbrAchatActuelDeal_Deal(int nbrAchatActuelDeal_Deal) {
        this.nbrAchatActuel_Deal = nbrAchatActuelDeal_Deal;
    }

    public void setNbrAchatValidation(int nbrAchatValidation) {
        this.nbrAchatValidation_Deal = nbrAchatValidation;
    }

    public void setEtatDeal_Deal(String etatDeal_Deal) {
        this.etatDeal_Deal = etatDeal_Deal;
    }

    public void setStatutDeal_Deal(Boolean StatutDeal) {
        this.statutDeal_Deal = StatutDeal;
    }

    public void setDateDebutDeal_Deal(Date dateDebutDeal_Deal) {
        this.dateDebutDeal_Deal = dateDebutDeal_Deal;
    }

    public void setDateFinDeal_Deal(Date dateFinDeal_Deal) {
        this.dateFinDeal_Deal = dateFinDeal_Deal;
    }

    public void setNbrAffichage_Deal(int nbrAffichage_Deal) {
        this.nbrAffichage_Deal = nbrAffichage_Deal;
    }

    public void setIdVendeur_Deal(int idVendeur_Deal) {
        this.idVendeur_Deal = idVendeur_Deal;
    }

    public void setIdDeal_Deal(int idDeal_Deal) {
        this.idDeal_Deal = idDeal_Deal;
    }
}
