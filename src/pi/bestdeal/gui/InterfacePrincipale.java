/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.gui;

import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pi.bestdeal.dao.DealDAO;
import pi.bestdeal.dao.VendeurDAO;
import pi.bestdeal.entities.Deal;
import pi.bestdeal.entities.Vendeur;
import pi.bestdeal.utils.TableModelClient;

/**
 *
 * @author Internet
 */
public class InterfacePrincipale extends javax.swing.JFrame {

    DealDAO list = DealDAO.getInstance();
    List<Deal> deals = list.displayDeal();
    TableModel tableModel = new TableModelClient(deals);
    

    /**
     * Creates new form InterfacePrincipale
     */
    public InterfacePrincipale() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Client_Panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Search_TextField = new javax.swing.JTextPane();
        Search_Button = new javax.swing.JButton();
        Add_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Display_Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BesDeal");

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        jScrollPane2.setViewportView(Search_TextField);

        Search_Button.setText("Recherche");

        Add_Button.setText("Ajouter");
        Add_Button.setToolTipText("Ajouter un Nouveau Deal");
        Add_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("Modifier");
        Update_Button.setToolTipText("Modifier le Deal sélectionné");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Delete_Button.setText("Supprimer");
        Delete_Button.setToolTipText("Supprimer le deal sélectionné");
        Delete_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_ButtonActionPerformed(evt);
            }
        });

        Display_Button.setText("Afficher");
        Display_Button.setToolTipText("Afficher le Deal");

        jTable1.setModel(tableModel);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout Client_PanelLayout = new javax.swing.GroupLayout(Client_Panel);
        Client_Panel.setLayout(Client_PanelLayout);
        Client_PanelLayout.setHorizontalGroup(
            Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Client_PanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Search_Button))
                    .addGroup(Client_PanelLayout.createSequentialGroup()
                        .addComponent(Add_Button)
                        .addGap(47, 47, 47)
                        .addComponent(Update_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51)
                        .addComponent(Delete_Button)
                        .addGap(40, 40, 40)
                        .addComponent(Display_Button)
                        .addGap(39, 39, 39))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        Client_PanelLayout.setVerticalGroup(
            Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Search_Button)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button)
                    .addComponent(Update_Button)
                    .addComponent(Delete_Button)
                    .addComponent(Display_Button))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestion des Deals", Client_Panel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Gestion des Clients", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Générer les Rapports", jPanel3);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Consulter les Messages", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Add_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add_ButtonActionPerformed

        Panel_Ajouter panajout = new Panel_Ajouter();

        Deal deal = new Deal();

        int result = JOptionPane.showConfirmDialog(null, panajout, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            deal.setTitreDeal_Deal(panajout.txtTitre.getText());
            Vendeur vendeur = new Vendeur();
            VendeurDAO daov = VendeurDAO.getInstance();
            for (Vendeur a : daov. displayvendeurByNom(String.valueOf(panajout.jList1.getSelectedValue()))) {
                vendeur = a;
            }
            deal.setDescDeal_Deal(panajout.txtDesc.getText());
            deal.setPrixDeal_Deal(Double.valueOf(panajout.txtPrix.getText()));
            deal.setNbrAchatValidation(Integer.valueOf(panajout.txtValidation.getText()));
            deal.setNbrAchatActuelDeal_Deal(0);
            deal.setNbrAffichage_Deal(0);
            deal.setEtatDeal_Deal("comming");
            deal.setStatutDeal_Deal(false);
            java.util.Date d1 = panajout.jdateDebut.getCalendar().getTime();
            java.sql.Date sqlDate = new java.sql.Date(d1.getTime());
            java.util.Date d2 = panajout.jdateFin.getCalendar().getTime();
            java.sql.Date sqlDate2 = new java.sql.Date(d2.getTime());
            deal.setDateDebutDeal_Deal(sqlDate);
            deal.setDateFinDeal_Deal(sqlDate2);
            deal.setIdVendeur_Deal(vendeur.getIdVendeur());
            DealDAO dealdao = DealDAO.getInstance();
            /*dealdao.insertDeal(deal, 5);*/
            dealdao.insertDeal(deal);
        } else {
            System.out.println("Cancelled");
        }

    }//GEN-LAST:event_Add_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        DealDAO dealdao = DealDAO.getInstance();
        Modifier_Ajouter modaj = new Modifier_Ajouter();
        Deal abc = new Deal();
        Deal deal = new Deal();

        int idd = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
        List<Deal> listdeal = dealdao.displayDealById((int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0));
        for (Deal a : listdeal) {
            abc = a;
        }
        modaj.txtTitre.setText(abc.getTitreDeal_Deal());
        modaj.txtDesc.setText(abc.getDescDeal_Deal());
        modaj.txtPrix.setText(abc.getPrixDeal_Deal().toString());
        modaj.txtValidation.setText(String.valueOf(abc.getNbrAchatValidation()));
        modaj.jdateDebut.setDate(abc.getDateDebutDeal_Deal());
        modaj.jdateFin.setDate(abc.getDateFinDeal_Deal());
        if (abc.isStatutDeal() == true) {
            modaj.jCheckBox1.setSelected(true);
        } else {
            modaj.jCheckBox1.setSelected(false);
        }
        abc.setEtatDeal_Deal(modaj.jComboBox1.getSelectedItem().toString());
        int result = JOptionPane.showConfirmDialog(null, modaj, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {

            deal.setTitreDeal_Deal(modaj.txtTitre.getText());
            Vendeur vendeur = new Vendeur();
            VendeurDAO daov = VendeurDAO.getInstance();
            for (Vendeur a : daov.displayvendeurByNom(String.valueOf(modaj.jList1.getSelectedValue()))) {
                vendeur = a;
            }
            deal.setIdDeal_Deal(idd);
            deal.setDescDeal_Deal(modaj.txtDesc.getText());
            deal.setPrixDeal_Deal(Double.valueOf(modaj.txtPrix.getText()));
            deal.setNbrAchatValidation(Integer.valueOf(modaj.txtValidation.getText()));
            deal.setNbrAchatActuelDeal_Deal(0);
            deal.setNbrAffichage_Deal(0);
            deal.setEtatDeal_Deal(modaj.jComboBox1.getSelectedItem().toString());
            java.util.Date d1 = modaj.jdateDebut.getCalendar().getTime();
            java.sql.Date sqlDate = new java.sql.Date(d1.getTime());
            java.util.Date d2 = modaj.jdateFin.getCalendar().getTime();
            java.sql.Date sqlDate2 = new java.sql.Date(d2.getTime());
            deal.setDateDebutDeal_Deal(sqlDate);
            deal.setDateFinDeal_Deal(sqlDate2);
            deal.setIdVendeur_Deal(vendeur.getIdVendeur());
            if (modaj.jCheckBox1.isSelected()) {
                deal.setStatutDeal_Deal(true);
            } else {
                deal.setStatutDeal_Deal(false);
            }
            int f = dealdao.updateStock(deal);
            
             
        jPanel1.repaint();
        
            
            if (f == 1) {
                JOptionPane.showMessageDialog(null, "Deal modifié");

            }
        } else {
            System.out.println("Cancelled");
        }

 
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void jTabbedPane1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTabbedPane1FocusGained
      
    }//GEN-LAST:event_jTabbedPane1FocusGained

    private void Delete_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_ButtonActionPerformed
      int result = JOptionPane.showConfirmDialog(null, "Voulez Vous Supprimer", null, JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
        int idd = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
       DealDAO dealdao = DealDAO.getInstance();
      int a= dealdao.deleteDeal(idd);
      if(a==1){
          JOptionPane.showMessageDialog(null, "Deal Supprimé");
      }
        }
       
    }//GEN-LAST:event_Delete_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfacePrincipale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new InterfacePrincipale().setVisible(true);
                

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add_Button;
    private javax.swing.JPanel Client_Panel;
    private javax.swing.JButton Delete_Button;
    private javax.swing.JButton Display_Button;
    private javax.swing.JButton Search_Button;
    private javax.swing.JTextPane Search_TextField;
    private javax.swing.JButton Update_Button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
