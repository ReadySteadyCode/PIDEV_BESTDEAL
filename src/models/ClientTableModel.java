/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pi.bestdeal.entities.Client;
import pi.bestdeal.entities.ClientMail;
import pi.bestdeal.entities.Deal;

/**
 *
 * @author Internet
 */
public class ClientTableModel extends AbstractTableModel{
    private List<ClientMail> clients;

    public ClientTableModel(List<ClientMail> clients) {
        this.clients = clients;
    }

    @Override
    public int getRowCount() {
       return clients.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:return "Nom";
            case 1:return "Prénom";
            case 2:return "E-Mail";
            case 3:return "Contenu";
                default:return "Error";
        }
    }
    

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClientMail mail = clients.get(rowIndex);
        switch (columnIndex){
            case 0:return mail.getNom();
            case 1:return mail.getPrenom();
            case 2:return mail.getEmail();
            case 3:return mail.getContenu();
            default:return 0;
        }
    }
    
}
