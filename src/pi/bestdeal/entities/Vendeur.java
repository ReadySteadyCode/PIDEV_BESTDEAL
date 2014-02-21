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
public class Vendeur {
    private int idVendeur;
  private String nomCommercial;
  private String addresse;
  private String typeBien;
  private  String description;
  private float note;

    @Override
    public String toString() {
        return "Vendeur{" + "idVendeur=" + idVendeur + ", nomCommercial=" + nomCommercial + ", addresse=" + addresse + ", typeBien=" + typeBien + ", description=" + description + ", note=" + note + '}';
    }

    public void setIdVendeur(int idVendeur) {
        this.idVendeur = idVendeur;
    }

    public void setNomCommercial(String nomCommercial) {
        this.nomCommercial = nomCommercial;
    }

    public void setAddresse(String addresse) {
        this.addresse = addresse;
    }

    public void setTypeBien(String typeBien) {
        this.typeBien = typeBien;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getIdVendeur() {
        return idVendeur;
    }

    public String getNomCommercial() {
        return nomCommercial;
    }

    public String getAddresse() {
        return addresse;
    }

    public String getTypeBien() {
        return typeBien;
    }

    public String getDescription() {
        return description;
    }

    public float getNote() {
        return note;
    }
}
