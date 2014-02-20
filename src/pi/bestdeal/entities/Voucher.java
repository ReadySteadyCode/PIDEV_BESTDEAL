/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.entities;

/**
 *
 * @author Internet
 */
public class Voucher {
    private  int idVoucher;
  private int idReservation;
  private int quantiteAchat;

    @Override
    public String toString() {
        return "Voucher{" + "idVoucher=" + idVoucher + ", idReservation=" + idReservation + ", quantiteAchat=" + quantiteAchat + '}';
    }

    public void setIdVoucher(int idVoucher) {
        this.idVoucher = idVoucher;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setQuantiteAchat(int quantiteAchat) {
        this.quantiteAchat = quantiteAchat;
    }

    public int getIdVoucher() {
        return idVoucher;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public int getQuantiteAchat() {
        return quantiteAchat;
    }
}
