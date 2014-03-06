/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.bestdeal.gui;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import pi.bestdeal.models.ClientTableModel;
import pi.bestdeal.dao.DealDAO;
import pi.bestdeal.dao.VendeurDAO;
import pi.bestdeal.entities.Deal;
import pi.bestdeal.entities.Vendeur;
import pi.bestdeal.models.DealTableModel;
import pi.bestdeal.models.DisplayClientTableModel;
import pi.bestdeal.models.Mail;
import pi.bestdeal.dao.ClientDAO;
import pi.bestdeal.dao.ImageDAO;
import pi.bestdeal.dao.MessageDAO;
import pi.bestdeal.entities.Client;
import pi.bestdeal.entities.ClientMail;
import pi.bestdeal.entities.ImageDeal;
import sun.misc.IOUtils;

/**
 *
 * @author Internet
 */
public class InterfacePrincipale extends javax.swing.JFrame {
    public int x;

    DealDAO list = DealDAO.getInstance();
    List<Deal> deals = list.displayDeal();
    TableModel tableModel = new DealTableModel(deals);
    MessageDAO listmessage = MessageDAO.getInstance();
    List<ClientMail> clientmail = listmessage.displayMessageWithSenderMail();
    TableModel mailmodel = new ClientTableModel(clientmail);
    ClientDAO clinetdao = ClientDAO.getInstance();
    List<Client> clients = clinetdao.displayClient();
    TableModel clientmodel = new DisplayClientTableModel(clients);

    /**
     * Creates new form InterfacePrincipale
     */
    public InterfacePrincipale() {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
        jTable1.removeColumn(jTable1.getColumn("ID"));
        jTable1.removeColumn(jTable1.getColumn("Description"));
        jTable1.removeColumn(jTable1.getColumn("Achat Actuel"));
        jTable1.removeColumn(jTable1.getColumn("Etat"));
        jTable1.removeColumn(jTable1.getColumn("Statut"));
        jTable1.removeColumn(jTable1.getColumn("Nombre d'Affichage"));
        jTable1.removeColumn(jTable1.getColumn("Vendeur"));
        jTable1.getColumnModel().setColumnMargin(20);
        jTable1.setRowSelectionInterval(0, 0);

    }
    public int getID()
    {
    return this.x;}

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
        Add_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Delete_Button = new javax.swing.JButton();
        Display_Button = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        erreur = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableMessage = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BesDeal");

        jTabbedPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTabbedPane1FocusGained(evt);
            }
        });

        Search_TextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Search_TextFieldKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(Search_TextField);

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
        Display_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Display_ButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(tableModel);
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jButton4.setText("Ajouter image deal");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Afficher images deal");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Client_PanelLayout = new javax.swing.GroupLayout(Client_Panel);
        Client_Panel.setLayout(Client_PanelLayout);
        Client_PanelLayout.setHorizontalGroup(
            Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Client_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Client_PanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_PanelLayout.createSequentialGroup()
                        .addComponent(Add_Button)
                        .addGap(47, 47, 47)
                        .addComponent(Update_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(51, 51, 51)
                        .addComponent(Delete_Button)
                        .addGap(40, 40, 40)
                        .addComponent(Display_Button)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_PanelLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)))
                .addContainerGap())
        );
        Client_PanelLayout.setVerticalGroup(
            Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Client_PanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(Client_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Add_Button)
                    .addComponent(Update_Button)
                    .addComponent(Delete_Button)
                    .addComponent(Display_Button))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Gestion des Deals", Client_Panel);

        jTable2.setModel(clientmodel);
        jScrollPane3.setViewportView(jTable2);

        erreur.setForeground(new java.awt.Color(204, 0, 0));

        jButton3.setText("Supprimer");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(erreur, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(erreur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jTabbedPane1.addTab("Gestion des Clients", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 638, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 424, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Générer les Rapports", jPanel3);

        jTableMessage.setModel(mailmodel);
        jScrollPane4.setViewportView(jTableMessage);

        jButton1.setText("Répondre");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Supprimer");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(292, 292, 292)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(8, 8, 8))
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
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            for (Vendeur a : daov.displayvendeurByNom(String.valueOf(panajout.jList1.getSelectedValue()))) {
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

            dealdao.insertDeal(deal);

            // ((DealTableModel)tableModel).add(deal);
            JOptionPane.showMessageDialog(null, "Ajout terminé");
            DealTableModel mymodel = new DealTableModel(deals);
            jTable1.setModel(mymodel);
            jTable1.removeColumn(jTable1.getColumn("ID"));
        jTable1.removeColumn(jTable1.getColumn("Description"));
        jTable1.removeColumn(jTable1.getColumn("Achat Actuel"));
        jTable1.removeColumn(jTable1.getColumn("Etat"));
        jTable1.removeColumn(jTable1.getColumn("Statut"));
        jTable1.removeColumn(jTable1.getColumn("Nombre d'Affichage"));
        jTable1.removeColumn(jTable1.getColumn("Vendeur"));
        jTable1.getColumnModel().setColumnMargin(20);
        jTable1.setRowSelectionInterval(0, 0);

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
        if(abc.getEtatDeal_Deal().toString().equals("Passé"))
            modaj.jComboBox1.setSelectedIndex(0);
        if(abc.getEtatDeal_Deal().toString().equals("Courant"))
            modaj.jComboBox1.setSelectedIndex(1);
         if(abc.getEtatDeal_Deal().toString().equals("Comming"))
            modaj.jComboBox1.setSelectedIndex(2);
       // "High-Tech", "Bricolage", "Bijouterie", "Vacances&Sorties", "Beauté", "Accessoires&Vétements", "Divers"
        //
        abc.setEtatDeal_Deal(modaj.jComboBox1.getSelectedItem().toString());
        int result = JOptionPane.showConfirmDialog(null, modaj, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {

            deal.setTitreDeal_Deal(modaj.txtTitre.getText());
            Vendeur vendeur = new Vendeur();
            VendeurDAO daov = VendeurDAO.getInstance();
            for (Vendeur a : daov.displayvendeurByNom(modaj.jList1.getSelectedValue().toString())) {
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
            int f = dealdao.updateDeal(deal);
            if (f == 1) {
                JOptionPane.showMessageDialog(null, "Deal modifié");

                DealTableModel mymodel = new DealTableModel(list.displayDeal());
                jTable1.setModel(mymodel);
                jTable1.removeColumn(jTable1.getColumn("ID"));
        jTable1.removeColumn(jTable1.getColumn("Description"));
        jTable1.removeColumn(jTable1.getColumn("Achat Actuel"));
        jTable1.removeColumn(jTable1.getColumn("Etat"));
        jTable1.removeColumn(jTable1.getColumn("Statut"));
        jTable1.removeColumn(jTable1.getColumn("Nombre d'Affichage"));
        jTable1.removeColumn(jTable1.getColumn("Vendeur"));
        jTable1.getColumnModel().setColumnMargin(20);
        jTable1.setRowSelectionInterval(0, 0);
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
            int a = dealdao.deleteDeal(idd);
            if (a == 1) {
                JOptionPane.showMessageDialog(null, "Deal Supprimé");
                DealTableModel mymodel = new DealTableModel(list.displayDeal());
                jTable1.setModel(mymodel);
                jTable1.removeColumn(jTable1.getColumn("ID"));
                jTable1.removeColumn(jTable1.getColumn("ID"));
        jTable1.removeColumn(jTable1.getColumn("Description"));
        jTable1.removeColumn(jTable1.getColumn("Achat Actuel"));
        jTable1.removeColumn(jTable1.getColumn("Etat"));
        jTable1.removeColumn(jTable1.getColumn("Statut"));
        jTable1.removeColumn(jTable1.getColumn("Nombre d'Affichage"));
        jTable1.removeColumn(jTable1.getColumn("Vendeur"));
        jTable1.getColumnModel().setColumnMargin(20);
        jTable1.setRowSelectionInterval(0, 0);

            }
        }

    }//GEN-LAST:event_Delete_ButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Interface_Mail intmail = new Interface_Mail();
        intmail.txt_to.setText(jTableMessage.getModel().getValueAt(jTableMessage.getSelectedRow(), 2).toString());
        int result = JOptionPane.showConfirmDialog(null, intmail, "Test",
                JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
        if (result == JOptionPane.OK_OPTION) {
            Mail monmail = new Mail();
            if (intmail.txt_cc.getText().equals("")) {
                monmail.sendEmail(intmail.txt_to.getText(), intmail.txt_to.getText(), intmail.jTextField4.getText(), intmail.txa_content.getText());
            } else {
                monmail.sendEmail(intmail.txt_to.getText(), intmail.txt_cc.getText(), intmail.jTextField4.getText(), intmail.txa_content.getText());
            }
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange

    }//GEN-LAST:event_jTable1PropertyChange

    private void Search_TextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Search_TextFieldKeyReleased
        List<Deal> recherche = new ArrayList<>();
        for (Deal a : list.displayDeal()) {
            if (a.getTitreDeal_Deal().toLowerCase().contains(this.Search_TextField.getText().toLowerCase())) {
                recherche.add(a);
            }

        }
        DealTableModel mymodel = new DealTableModel(recherche);
        jTable1.setModel(mymodel);
        jTable1.removeColumn(jTable1.getColumn("ID"));
    }//GEN-LAST:event_Search_TextFieldKeyReleased

    private void Display_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Display_ButtonActionPerformed
        DealDAO dealdao = DealDAO.getInstance();
        PanelAffichage panneauAffichage = new PanelAffichage();
        Deal abc = new Deal();
        Deal deal = new Deal();
        int idd = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
         List<Deal> listdeal = dealdao.displayDealById(idd);
        for (Deal a : listdeal) {
            abc = a;
        }
        panneauAffichage.txtTitre.setText(abc.getTitreDeal_Deal());
        panneauAffichage.txtDesc.setText(abc.getDescDeal_Deal());
        panneauAffichage.txtPrix.setText(abc.getPrixDeal_Deal().toString());
        panneauAffichage.txtValidation.setText(String.valueOf(abc.getNbrAchatValidation()));
        panneauAffichage.jdateDebut.setDate(abc.getDateDebutDeal_Deal());
        panneauAffichage.jdateFin.setDate(abc.getDateFinDeal_Deal());
        panneauAffichage.txtVendeurAffichage.setText(null);
        if (abc.isStatutDeal() == true) {
            panneauAffichage.txtStatutAffichage.setText("Deal Confirmé");
        } else {
            panneauAffichage.txtStatutAffichage.setText("Deal non Confirmé");
        }
        Vendeur vendeur = new Vendeur();
            VendeurDAO daov = VendeurDAO.getInstance();
            int idv = (int) jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0);
            panneauAffichage.txtVendeurAffichage.setText(daov.displayvendeurByID(idv).getNomCommercial());
            panneauAffichage.txtEtat.setText(abc.getEtatDeal_Deal());
            panneauAffichage.txtCategorie.setText(abc.getCategorie_Deal());
            panneauAffichage.txtAffichage.setText(String.valueOf(abc.getNbrAffichage_Deal()));
            panneauAffichage.txtAchatActuel.setText(String.valueOf(abc.getNbrAchatActuelDeal_Deal()));
            JOptionPane.showMessageDialog(null, panneauAffichage, "Affichage",
                JOptionPane.YES_OPTION);
            
    }//GEN-LAST:event_Display_ButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if (jTable2.getSelectedRow()==-1) {
            erreur.setText("Veuillez choisir un client à supprimer");
            
        }else  
        {int result = JOptionPane.showConfirmDialog(null, "Voulez Vous Supprimer", null, JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
        
        int indice=(int)jTable2.getValueAt(jTable2.getSelectedRow(), jTable2.getSelectedColumn());
       int a= clinetdao.deleteClient(indice);
        if (a == 1) {
                JOptionPane.showMessageDialog(null, "Client Supprimé");
       
        DisplayClientTableModel model2=new DisplayClientTableModel(clinetdao.displayClient());
        jTable2.setModel(model2);
        }       
        }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        AddImage img=new  AddImage();
        final JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(null);
        String file=fc.getSelectedFile().toString();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ImageDeal imgdeal=new ImageDeal();
        Path path=Paths.get(file);
        try {
            imgdeal.setImage(Files.readAllBytes(path));
            System.out.println( imgdeal.getImage());
            
        } catch (IOException ex) {
            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
        }
        imgdeal.setIdDeal(1);
        ImageDAO im= new ImageDAO();
        im.InsertImage(imgdeal);
        
       
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        ImageDeal img=new  ImageDeal();
       
        
        AddImage add=new AddImage();
        ImageDAO im= new ImageDAO();
        Deal deal=new Deal();
       x=(int) tableModel.getValueAt(jTable1.getSelectedRow(), 0);
       add.a=x;
      
       System.out.println(x);
       
                
      //  int id=jTable1.get
        //
      img=im.DisplayAllImage(x).get(0);
      ImageIcon icon=new ImageIcon(img.getImage());
      add.image.setIcon(icon);
      add.jButton3.setEnabled(false);
      JOptionPane.showOptionDialog(null, add, "Images deal", JOptionPane.OK_CANCEL_OPTION, JOptionPane.DEFAULT_OPTION, null, null, null);
//        try {
//            FileOutputStream file=new FileOutputStream("C:\\Android\\oumayma.jpg");
//            try {
//                file.write(img.getImage());
//                file.close();
//            } catch (IOException ex) {
//                Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(InterfacePrincipale.class.getName()).log(Level.SEVERE, null, ex);
//        }
//      
       // add.image.setIcon(null);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

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
    private javax.swing.JTextPane Search_TextField;
    private javax.swing.JButton Update_Button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel erreur;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTableMessage;
    // End of variables declaration//GEN-END:variables

}
