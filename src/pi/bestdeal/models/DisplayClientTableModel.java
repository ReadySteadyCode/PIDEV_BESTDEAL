/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pi.bestdeal.models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pi.bestdeal.entities.Client;

/**
 *
 * @author Internet
 */
public class DisplayClientTableModel extends AbstractTableModel {
    private List<Client> clients;

    public DisplayClientTableModel(List<Client> clients) {
        this.clients = clients;
    }


    @Override
    public int getRowCount() {
      return clients.size();
    }

    @Override
    public int getColumnCount() {
      return 5;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:return "ID";
            case 1:return "Nom";
            case 2:return "Prénom";
            case 3:return "E-mail"; 
            case 4: return "Nb signalisation";
                default:return "Autres";
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Client client = clients.get(rowIndex);
        switch (columnIndex){
            case 0:return client.getIdClient();
            case 1:return client.getNom();
            case 2:return client.getPrenom();
            case 3:return client.getEmail(); 
            case 4: return client.getNbrSignalisation();
            default:return 0;
        }
    }
    
}
