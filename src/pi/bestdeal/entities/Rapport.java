/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.entities;

import java.sql.Date;

/**
 *
 * @author Internet
 */
public class Rapport {

    private int idRapport;

    public Rapport() {
    }

    public Rapport(int idRapport, Date dateAjout, String titre, String contenu, Date dateDebut, Date dateFin) {
        this.idRapport = idRapport;
        this.dateAjout = dateAjout;
        this.titre = titre;
        this.contenu = contenu;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }
    private Date dateAjout;
    private String titre;
    private String contenu;
    private Date dateDebut;
    private Date dateFin;

    public void setIdRapport(int idRapport) {
        this.idRapport = idRapport;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public int getIdRapport() {
        return idRapport;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public String getTitre() {
        return titre;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    @Override
    public String toString() {
        return "Rapport{" + "idRapport=" + idRapport + ", dateAjout=" + dateAjout + ", titre=" + titre + ", contenu=" + contenu + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin + '}';
    }

}
