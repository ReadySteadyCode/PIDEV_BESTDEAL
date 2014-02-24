

package pi.bestdeal.gui;

import java.awt.event.KeyEvent;

/**
 *
 * @author hp
 */
public class Ajouter_Deal extends javax.swing.JInternalFrame {

    /**
     * Creates new form Ajouter_Deal
     */
    public Ajouter_Deal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLb_Nom_Deal = new javax.swing.JLabel();
        jLb_Pres = new javax.swing.JLabel();
        txt_nom_deal = new javax.swing.JTextField();
        txt_Pres = new javax.swing.JTextField();
        jLb_Desc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_desc = new javax.swing.JTextArea();
        jLb_DateD = new javax.swing.JLabel();
        jLb_DateF = new javax.swing.JLabel();
        jLb_nb_pers = new javax.swing.JLabel();
        jLb_nb_min_pers = new javax.swing.JLabel();
        jLb_nb_max_Pers = new javax.swing.JLabel();
        jLb_Prix = new javax.swing.JLabel();
        jBt_Annuler = new javax.swing.JButton();
        jBt_Enregistrer = new javax.swing.JButton();
        txt_nb_pers = new javax.swing.JTextField();
        txt_nb_min_pers = new javax.swing.JTextField();
        txt_nb_max_pers = new javax.swing.JTextField();
        txt_Prix = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        jLb_Nom_Deal.setText("Nom Deal");

        jLb_Pres.setText("Préstataire");

        txt_nom_deal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nom_dealKeyTyped(evt);
            }
        });

        txt_Pres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PresKeyTyped(evt);
            }
        });

        jLb_Desc.setText("Description");

        txtA_desc.setColumns(20);
        txtA_desc.setRows(5);
        txtA_desc.setToolTipText("");
        jScrollPane1.setViewportView(txtA_desc);

        jLb_DateD.setText("Date Début");

        jLb_DateF.setText("Date Fin");

        jLb_nb_pers.setText("Nombre de Personne");

        jLb_nb_min_pers.setText("Nomdre min de Personne");

        jLb_nb_max_Pers.setText("Nombre max de Personne");

        jLb_Prix.setText("Prix");

        jBt_Annuler.setText("Annuler");
        jBt_Annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_AnnulerActionPerformed(evt);
            }
        });

        jBt_Enregistrer.setText("Enregistrer");
        jBt_Enregistrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBt_EnregistrerActionPerformed(evt);
            }
        });

        txt_nb_pers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nb_persKeyTyped(evt);
            }
        });

        txt_nb_min_pers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nb_min_persKeyTyped(evt);
            }
        });

        txt_nb_max_pers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nb_max_persKeyTyped(evt);
            }
        });

        txt_Prix.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_PrixKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBt_Enregistrer)
                .addGap(66, 66, 66)
                .addComponent(jBt_Annuler)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLb_Desc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLb_Pres)
                            .addComponent(jLb_Nom_Deal))
                        .addGap(219, 219, 219)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_Pres)
                            .addComponent(txt_nom_deal)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLb_DateD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLb_nb_max_Pers)
                            .addComponent(jLb_nb_min_pers)
                            .addComponent(jLb_nb_pers)
                            .addComponent(jLb_DateF)
                            .addComponent(jLb_Prix))
                        .addGap(149, 149, 149)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nb_max_pers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nb_min_pers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_nb_pers, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_Prix))))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLb_Nom_Deal)
                                            .addComponent(txt_nom_deal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLb_Pres))
                                    .addComponent(txt_Pres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLb_Desc)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLb_DateD)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLb_DateF))
                        .addGap(20, 20, 20)
                        .addComponent(txt_nb_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLb_nb_pers))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nb_min_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_nb_min_pers))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLb_nb_max_Pers)
                    .addComponent(txt_nb_max_pers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Prix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLb_Prix))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBt_Annuler)
                    .addComponent(jBt_Enregistrer))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBt_AnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_AnnulerActionPerformed
       String Command= evt.getActionCommand();
        if (Command.equals("Annuler"))
        {
         Ajouter_Deal JIF = new Ajouter_Deal();
         JIF.show();
         this.setVisible(false);   
        }
    }//GEN-LAST:event_jBt_AnnulerActionPerformed

    private void txt_nb_persKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nb_persKeyTyped
       char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)|| c== KeyEvent.VK_DELETE) )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nb_persKeyTyped

    private void txt_nb_min_persKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nb_min_persKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)|| c== KeyEvent.VK_DELETE) )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nb_min_persKeyTyped

    private void txt_nb_max_persKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nb_max_persKeyTyped
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)|| c== KeyEvent.VK_DELETE) )
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nb_max_persKeyTyped

    private void txt_PrixKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PrixKeyTyped
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar()!='.')
        {
            getToolkit().beep();
            evt.consume();
        }
        if (evt.getKeyChar()=='.' && txt_Prix.getText().contains("."))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_PrixKeyTyped

    private void txt_nom_dealKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nom_dealKeyTyped
         char c =evt.getKeyChar();
        if((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)|| c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nom_dealKeyTyped

    private void txt_PresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PresKeyTyped
        char c =evt.getKeyChar();
        if((Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE)|| c== KeyEvent.VK_DELETE))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txt_PresKeyTyped

    private void jBt_EnregistrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBt_EnregistrerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBt_EnregistrerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBt_Annuler;
    private javax.swing.JButton jBt_Enregistrer;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLb_DateD;
    private javax.swing.JLabel jLb_DateF;
    private javax.swing.JLabel jLb_Desc;
    private javax.swing.JLabel jLb_Nom_Deal;
    private javax.swing.JLabel jLb_Pres;
    private javax.swing.JLabel jLb_Prix;
    private javax.swing.JLabel jLb_nb_max_Pers;
    private javax.swing.JLabel jLb_nb_min_pers;
    private javax.swing.JLabel jLb_nb_pers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtA_desc;
    private javax.swing.JTextField txt_Pres;
    private javax.swing.JTextField txt_Prix;
    private javax.swing.JTextField txt_nb_max_pers;
    private javax.swing.JTextField txt_nb_min_pers;
    private javax.swing.JTextField txt_nb_pers;
    private javax.swing.JTextField txt_nom_deal;
    // End of variables declaration//GEN-END:variables
}
