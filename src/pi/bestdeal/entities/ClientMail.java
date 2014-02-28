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
public class ClientMail {
    private String nom;
    private String prenom;
    private String email;
    private String contenu;

    @Override
    public String toString() {
        return "ClientMail{" + "nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", contenu=" + contenu + '}';
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public String getContenu() {
        return contenu;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public ClientMail() {
    }
    
}
