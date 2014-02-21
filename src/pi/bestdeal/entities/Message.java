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
public class Message {
    private int idMessage;
  private int idClient;
  private String contenu;

    public int getIdMessage() {
        return idMessage;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getContenu() {
        return contenu;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public boolean isStatutLivraison() {
        return statutLivraison;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public void setStatutLivraison(boolean statutLivraison) {
        this.statutLivraison = statutLivraison;
    }

    @Override
    public String toString() {
        return "Message{" + "idMessage=" + idMessage + ", idClient=" + idClient + ", contenu=" + contenu + ", dateEnvoi=" + dateEnvoi + ", statutLivraison=" + statutLivraison + '}';
    }
  private Date dateEnvoi;
  private boolean statutLivraison;
}
