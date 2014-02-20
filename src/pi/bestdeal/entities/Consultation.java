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
public class Consultation {
    
  private int idConsultation;
  private int IdDeal;
  private int idClient; 
   private Date dateCreation;

    public int getIdConsultation() {
        return idConsultation;
    }

    public int getIdDeal() {
        return IdDeal;
    }

    @Override
    public String toString() {
        return "Consultation{" + "idConsultation=" + idConsultation + ", IdDeal=" + IdDeal + ", idClient=" + idClient + ", dateCreation=" + dateCreation + '}';
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdConsultation(int idConsultation) {
        this.idConsultation = idConsultation;
    }

    public void setIdDeal(int IdDeal) {
        this.IdDeal = IdDeal;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Date getDateCreation() {
        return dateCreation;
    }
  

    
}
