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
    private String categorie_Deal;

    public String getCategorie_Deal() {
        return categorie_Deal;
    }

    @Override
    public String toString() {
        return "Deal{" + "idDeal_Deal=" + idDeal_Deal + ", titreDeal_Deal=" + titreDeal_Deal + ", descDeal_Deal=" + descDeal_Deal + ", prixDeal_Deal=" + prixDeal_Deal + ", nbrAchatActuel_Deal=" + nbrAchatActuel_Deal + ", nbrAchatValidation_Deal=" + nbrAchatValidation_Deal + ", etatDeal_Deal=" + etatDeal_Deal + ", statutDeal_Deal=" + statutDeal_Deal + ", dateDebutDeal_Deal=" + dateDebutDeal_Deal + ", dateFinDeal_Deal=" + dateFinDeal_Deal + ", nbrAffichage_Deal=" + nbrAffichage_Deal + ", idVendeur_Deal=" + idVendeur_Deal + '}';
    }

    public Deal() {
    }

    public Deal(int idDeal_Deal, String titreDeal_Deal, String descDeal_Deal, Double prixDeal_Deal, int nbrAchatActuel_Deal, int nbrAchatValidation_Deal, String etatDeal_Deal, Boolean statutDeal_Deal, Date dateDebutDeal_Deal, Date dateFinDeal_Deal, int nbrAffichage_Deal, int idVendeur_Deal, String categorie_Deal) {
        this.idDeal_Deal = idDeal_Deal;
        this.titreDeal_Deal = titreDeal_Deal;
        this.descDeal_Deal = descDeal_Deal;
        this.prixDeal_Deal = prixDeal_Deal;
        this.nbrAchatActuel_Deal = nbrAchatActuel_Deal;
        this.nbrAchatValidation_Deal = nbrAchatValidation_Deal;
        this.etatDeal_Deal = etatDeal_Deal;
        this.statutDeal_Deal = statutDeal_Deal;
        this.dateDebutDeal_Deal = dateDebutDeal_Deal;
        this.dateFinDeal_Deal = dateFinDeal_Deal;
        this.nbrAffichage_Deal = nbrAffichage_Deal;
        this.idVendeur_Deal = idVendeur_Deal;
        this.categorie_Deal = categorie_Deal;
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

    public void setCategorie_Deal(String categorie_Deal) {
        this.categorie_Deal = categorie_Deal;
    }
}
