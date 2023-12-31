/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.gestionMilitaire;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Connexion;
import model.Parameter;
import model.militaire;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class listeMilitaire extends javax.swing.JInternalFrame {
    gestionMilitaire gm = new gestionMilitaire();
    Connexion con = new Connexion();
    Parameter p = new Parameter();
    militaire ml = new militaire();
    PreparedStatement ps;
    ResultSet rs = null;
    static String test;
    public static String IdMilt;
    /**
     * Creates new form listeMilitaire
     */
    public listeMilitaire() {
        initComponents();
    }

    public void recherche(javax.swing.JTable table,Connexion con){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Identifiant");
       // model.addColumn("Photo");
        model.addColumn("Nom et Prenom");
        model.addColumn("Promotion");
        model.addColumn("Date d'entrée en Service");
        model.addColumn("Sexe");
        model.addColumn("Statut");
        model.addColumn("Armée");
        model.addColumn("Spécialité");
        model.addColumn("Numero Matricule");
        model.addColumn("Matricule finance");
        model.addColumn("CIN");
        model.addColumn("Corps");
        model.addColumn("Compagnie");
        model.addColumn("Date de Naissance");
        model.addColumn("Position");
        model.addColumn("Reference position");
        table.setModel(model);
        
        
            String req = "SELECT * FROM militaire WHERE NomMilt like '%"+rech.getText()+"%' or Promotion like '%"+rech.getText()+"%'or NumMatr like '%"+rech.getText()+"%' or MatrFinance like '%"+rech.getText()+"%' or CIN like '%"+rech.getText()+"%' or Corps like '%"+rech.getText()+"%' or Compagnie like '%"+rech.getText()+"%' or Position like '%"+rech.getText()+"%' or RefPosition like '%"+rech.getText()+"%' or DateEntrServ like '%"+rech.getText()+"%' ";
        try{
             rs =gm.execution (con , req);
             while(rs.next()){
             String IdMilt = rs.getString("IdMilt");
            // String PhotoMilt = rs.getString("PhotoMilt");
             String NomMilt = rs.getString("NomMilt");
             String Promotion = rs.getString("Promotion");
             String DateEntrServ = rs.getString("DateEntrServ");
             String Sexe = rs.getString("Sexe");
             String Statut = rs.getString("Statut");
             String Arme = rs.getString("Arme");
             String Specialite = rs.getString("Specialite");
             String NumMatr = rs.getString("NumMatr");
             String MatrFinance = rs.getString("MatrFinance");
             String CIN = rs.getString("CIN");
             String Corps = rs.getString("Corps");
             String Compagnie = rs.getString("Compagnie");
             String DateNaiss = rs.getString("DateNaiss");
             String Position = rs.getString("Position");
             String RefPosition = rs.getString("RefPosition");
             //IdMilt,PhotoMilt,
Object []ligne = {IdMilt,NomMilt,Promotion,DateEntrServ,Sexe,Statut,Arme,Specialite,NumMatr,MatrFinance,CIN,Corps,Compagnie,DateNaiss,Position,RefPosition};
                    model.addRow(ligne);
             }
             
          }  catch (Exception e){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnAjout = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        btnSuppr = new javax.swing.JButton();
        btnDetail = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rech = new javax.swing.JTextField();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setTitle("Listes");
        setMinimumSize(new java.awt.Dimension(46, 27));
        setNormalBounds(new java.awt.Rectangle(0, 0, 46, 0));
        setPreferredSize(new java.awt.Dimension(46, 27));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnAjout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/new.png"))); // NOI18N
        btnAjout.setText("Ajouter");
        btnAjout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAjout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjoutActionPerformed(evt);
            }
        });

        btnModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit_20px.png"))); // NOI18N
        btnModif.setText("Modifier");
        btnModif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
            }
        });

        btnSuppr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        btnSuppr.setText("Supprimer");
        btnSuppr.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprActionPerformed(evt);
            }
        });

        btnDetail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/type.png"))); // NOI18N
        btnDetail.setText("Details");
        btnDetail.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        jPanel1.setMaximumSize(new java.awt.Dimension(30, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(30, 100));

        rech.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rech.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rechKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                rechKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(rech, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(rech)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 565, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAjout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModif, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSuppr, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDetail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAjout, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnDetail, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
       gm.listerMilitaire(jTable1, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1AncestorAdded

    private void btnAjoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjoutActionPerformed
        new AjoutMilitaire(null, rootPaneCheckingEnabled).setVisible(true);
        // new AjoutMilitaire(this, rootPaneCheckingEnabled).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAjoutActionPerformed

    private void rechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyPressed
        recherche(jTable1, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechKeyPressed

    private void rechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyReleased
        recherche(jTable1, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechKeyReleased

    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        int n = jTable1.getSelectedRow();
        IdMilt = (String) jTable1.getValueAt(n, 0);
        new ModifMilitaire(null, rootPaneCheckingEnabled).setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifActionPerformed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        // TODO add your handling code here:
        
        gm.listerMilitaire(jTable1, con);
    }//GEN-LAST:event_formInternalFrameActivated

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int n = jTable1.getSelectedRow();
        IdMilt = (String) jTable1.getValueAt(n, 0);
        new detail(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_btnDetailActionPerformed

    private void btnSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(null, "Voulez vous vraiment supprimer ce militaire ?") == JOptionPane.YES_OPTION){
            try {
                gm.SupprimerMilitaire(con, IdMilt);
        } catch (Exception e) {
            }
        }
        gm.listerMilitaire(jTable1, con);
    }//GEN-LAST:event_btnSupprActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjout;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton btnModif;
    private javax.swing.JButton btnSuppr;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField rech;
    // End of variables declaration//GEN-END:variables
}
