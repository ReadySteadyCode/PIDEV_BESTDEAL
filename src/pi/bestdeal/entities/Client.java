/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.entities;

import java.util.Date;
import javax.xml.crypto.Data;

/**
 *
 * @author Internet
 */
public class Client {
    
  
   private int idClient; 

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setTelephone(String Telephone) {
        this.Telephone = Telephone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setListedechoix(String listedechoix) {
        this.listedechoix = listedechoix;
    }

    public void setCIN(int CIN) {
        this.CIN = CIN;
    }

    public void setDatenaissance(Date datenaissance) {
        this.datenaissance = datenaissance;
    }

    public int getIdClient() {
        return idClient;
    }

    @Override
    public String toString() {
        return "Client{" + "idClient=" + idClient + ", nom=" + nom + ", prenom=" + prenom + ", password=" + password + ", Telephone=" + Telephone + ", email=" + email + ", listedechoix=" + listedechoix + ", CIN=" + CIN + ", datenaissance=" + datenaissance + '}';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPassword() {
        return password;
    }

    public String getTelephone() {
        return Telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getListedechoix() {
        return listedechoix;
    }

    public int getCIN() {
        return CIN;
    }

    public Date getDatenaissance() {
        return datenaissance;
    }
   private  String nom ;
  private String prenom ;
  private  String password ; 
  private  String Telephone ;
   private  String email ; 
  private  String listedechoix ;
  private int CIN ;
  private  Date datenaissance ;
  
 

}
