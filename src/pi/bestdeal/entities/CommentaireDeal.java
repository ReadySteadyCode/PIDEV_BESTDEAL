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
public class CommentaireDeal {
   
   private  int idCommentaireDeal;

    @Override
    public String toString() {
        return "CommentaireDeal{" + "idCommentaireDeal=" + idCommentaireDeal + ", dateAjout=" + dateAjout + ", idClient=" + idClient + ", idDeal=" + idDeal + ", contenu=" + contenu + '}';
    }

    public void setIdCommentaireDeal(int idCommentaireDeal) {
        this.idCommentaireDeal = idCommentaireDeal;
    }

    public void setDateAjout(Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }
  private  Date dateAjout;
  private int idClient;

    public int getIdCommentaireDeal() {
        return idCommentaireDeal;
    }

    public Date getDateAjout() {
        return dateAjout;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public String getContenu() {
        return contenu;
    }
  private int idDeal;
  private String contenu ;
  

}
