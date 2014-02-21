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
public class Internaute {
   
  private int idInternaute;
  private String mailInternaute;
  private String centreInteret;

    public int getIdInternaute() {
        return idInternaute;
    }

    public String getMailInternaute() {
        return mailInternaute;
    }

    public String getCentreInteret() {
        return centreInteret;
    }

    public void setIdInternaute(int idInternaute) {
        this.idInternaute = idInternaute;
    }

    public void setMailInternaute(String mailInternaute) {
        this.mailInternaute = mailInternaute;
    }

    public void setCentreInteret(String centreInteret) {
        this.centreInteret = centreInteret;
    }

    @Override
    public String toString() {
        return "Internaute{" + "idInternaute=" + idInternaute + ", mailInternaute=" + mailInternaute + ", centreInteret=" + centreInteret + '}';
    }
  

}
