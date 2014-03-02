/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.utils;

import java.util.Calendar;
import java.util.Date;
import pi.bestdeal.dao.ClientDAO;
import pi.bestdeal.dao.DealDAO;
import pi.bestdeal.dao.MessageDAO;
import pi.bestdeal.entities.Client;
import pi.bestdeal.entities.ClientMail;
import pi.bestdeal.entities.Deal;

/**
 *
 * @author Internet
 */
public class PIDEV_BESTDEAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* ClientDAO client = new ClientDAO();
        //Deal dd = new Deal("hello", "world", 5, 12, "happy", true, Date.valueOf("2014/01/02 00:00:00"), 120, 0);
        DealDAO deal = new DealDAO();
       //deal.insertDeal(dd);
        for(Deal a:deal.displayDeal())
        {
           System.out.println( a.toString());
        }
        for(Client a:client.displayClient())
        {
            System.out.println(a.toString());
        }*/
        MessageDAO daom= MessageDAO.getInstance();
        for(ClientMail a:daom.displayMessageWithSenderMail()){
            System.out.println(a.toString());
           Date date = new Date();
           Calendar calendar = Calendar.getInstance();
            System.out.println(date);
           // System.out.println(calendar.);
        }
        
    }
    
}
