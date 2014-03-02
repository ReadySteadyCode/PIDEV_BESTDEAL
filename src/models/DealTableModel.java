/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import pi.bestdeal.entities.ClientMail;
import pi.bestdeal.entities.Deal;

/**
 *
 * @author Internet
 */
public class DealTableModel extends AbstractTableModel {

    private List<Deal> deals;

    public DealTableModel(List<Deal> deals) {
        this.deals = deals;
    }

    @Override
    public String getColumnName(int column) {
        switch (column) {
            case 0:
                return "ID";
            case 1:
                return "Titre";
            case 2:
                return "Description";
            case 3:
                return "Prix";
            case 4:
                return "Achat Actuel";
            case 5:
                return "Achat de validation";
            case 6:
                return "Etat";
            case 7:
                return "Statut";
            case 8:
                return "Date de Début";
            case 9:
                return "Date Finale";
            case 10:
                return "Nombre d'Affichage";
            case 11:
                return "Vendeur";
            case 12:
                return "Catégorie";
            default:
                return "problème d'affichage";
        }
    }

    @Override
    public int getRowCount() {
        return deals.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Deal deal = deals.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return deal.getIdDeal_Deal();
            case 1:
                return deal.getTitreDeal_Deal();
            case 2:
                return deal.getDescDeal_Deal();
            case 3:
                return deal.getPrixDeal_Deal();
            case 4:
                return deal.getNbrAchatActuelDeal_Deal();
            case 5:
                return deal.getNbrAchatValidation();
            case 6:
                return deal.getEtatDeal_Deal();
            case 7:
                return deal.isStatutDeal();
            case 8:
                return deal.getDateDebutDeal_Deal();
            case 9:
                return deal.getDateFinDeal_Deal();
            case 10:
                return deal.getNbrAffichage_Deal();
            case 11:
                return deal.getIdVendeur_Deal();
            case 12:
                return deal.getCategorie_Deal();
            default:
                return 0;
        }
    }

    public void add(Deal deal) {
        int size = this.getRowCount();
        deals.add(deal);
        fireTableRowsInserted(size, size);
        
    }
    public void update(Deal deal){
        if(deals.contains(deal)){
            int index = deals.indexOf(deal);
            deals.remove(index);
            deals.add(index,deal);
        }
        fireTableStructureChanged();
    }

    public void remove(Deal deal) {
        int size = this.getRowCount();
            int index = deals.indexOf(deal);
            deals.remove(index-1);
            fireTableRowsDeleted(index, index);
        }

}

