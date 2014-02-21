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
public class Reservation {
    private int idReservation;
  private boolean statutReservation;
  private int idClient;
  private int idDeal;

    public int getIdReservation() {
        return idReservation;
    }

    public boolean isStatutReservation() {
        return statutReservation;
    }

    public int getIdClient() {
        return idClient;
    }

    public int getIdDeal() {
        return idDeal;
    }

    public Date getDateRerservation() {
        return dateRerservation;
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setStatutReservation(boolean statutReservation) {
        this.statutReservation = statutReservation;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setIdDeal(int idDeal) {
        this.idDeal = idDeal;
    }

    public void setDateRerservation(Date dateRerservation) {
        this.dateRerservation = dateRerservation;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    @Override
    public String toString() {
        return "Reservation{" + "idReservation=" + idReservation + ", statutReservation=" + statutReservation + ", idClient=" + idClient + ", idDeal=" + idDeal + ", dateRerservation=" + dateRerservation + ", dateModification=" + dateModification + '}';
    }
  private Date dateRerservation;
  private Date dateModification;
}
