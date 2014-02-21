/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.entities;

import java.util.Date;

/**
 *
 * @author Internet
 */
public class CommentaireVendeur {
    
  private  int idCommentaireVendeur ;
  private Date dateAjout;
  private  int idClient;
  private int idVendeur;
  private String contenu;

    public int getIdCommentaireVendeur() {
        return idCommentaireVendeur;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public int getIdClient() {
        return idClient;
    }

    @Override
    public String toString() {
        return "CommentaireVendeur{" + "idCommentaireVendeur=" + idCommentaireVendeur + ", dateAjout=" + dateAjout + ", idClient=" + idClient + ", idVendeur=" + idVendeur + ", contenu=" + contenu + '}';
    }

    public void setIdCommentaireVendeur(int idCommentaireVendeur) {
        this.idCommentaireVendeur = idCommentaireVendeur;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public String getContenu() {
        return contenu;
    }
  

}
