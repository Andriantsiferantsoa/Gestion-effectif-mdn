/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.gestionMilitaire;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JDialog;
import model.Connexion;
import model.Parameter;
import model.militaire;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.swing.JRViewer;

/**
 *
 * @author Asus
 */
public class miltax extends javax.swing.JInternalFrame {
    gestionMilitaire gm = new gestionMilitaire();
    Connexion con = new Connexion();
    Parameter p = new Parameter();
    militaire ml = new militaire();
    PreparedStatement ps;
    ResultSet rs = null;
    static String test;
    /**
     * Creates new form listeMilitaire
     */
    public miltax() {
        initComponents();
        cbGrade.setVisible(true);
        cbCorps.setVisible(false);
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
             
          }  catch (SQLException e){}
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void afficher(String text){
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
        
        
            String req = "SELECT * FROM militaire WHERE "+text;
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
             
          }  catch (SQLException e){
            System.err.println(e.toString());}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btImprimer = new javax.swing.JButton();
        btnModif = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rech = new javax.swing.JTextField();
        cbType = new javax.swing.JComboBox<>();
        cbGrade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        cbCorps = new javax.swing.JComboBox<>();

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

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tableAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(table);

        btImprimer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Print_20px.png"))); // NOI18N
        btImprimer.setText("Imprimer");
        btImprimer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btImprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btImprimerActionPerformed(evt);
            }
        });

        btnModif.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Edit_20px.png"))); // NOI18N
        btnModif.setText("Promotion");
        btnModif.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifActionPerformed(evt);
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

        cbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "Corps" }));
        cbType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTypeItemStateChanged(evt);
            }
        });

        cbGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbGrade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbGradeItemStateChanged(evt);
            }
        });
        cbGrade.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbGradePropertyChange(evt);
            }
        });

        jLabel1.setText("Affichage par : ");

        cbCorps.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbCorps.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbCorpsPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(btImprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCorps, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(cbCorps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btImprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(btnModif, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tableAncestorAdded
        //gm.listerMilitaire(jTable1, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_tableAncestorAdded

    private void btImprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btImprimerActionPerformed
        if("Corps".equals(cbType.getSelectedItem().toString())){
            charger("corps", "Liste des "+cbCorps.getSelectedItem().toString(), "Corps", cbCorps.getSelectedItem().toString());
        }else{
            charger("grade","Liste de "+cbGrade.getSelectedItem().toString(), "Grade", String.valueOf(recupererIdGrade(cbGrade.getSelectedItem().toString())));
        }
    }//GEN-LAST:event_btImprimerActionPerformed
        public static String IdMilt;
    private void btnModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifActionPerformed
        int n = table.getSelectedRow();
        IdMilt = (String) table.getValueAt(n, 0);
        new Promotion(null, rootPaneCheckingEnabled).setVisible(true);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifActionPerformed

    private void cbTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTypeItemStateChanged
        if("Corps".equals(cbType.getSelectedItem().toString())){
            cbCorps.setVisible(true);
            cbGrade.setVisible(false);
            //recupererCorps();
        }else{
            cbCorps.setVisible(false);
            cbGrade.setVisible(true);
            recupererLibGrade();
        }
    }//GEN-LAST:event_cbTypeItemStateChanged
    public void recupererLibGrade(){
        try {
            cbGrade.removeAllItems();
            rs = gm.execution(con, "SELECT * FROM grade");
            while(rs.next()){
                cbGrade.addItem(rs.getString("LibGrade"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    public int recupererIdGrade(String text){
        int i =0 ;
        try {
            if(text.contains("'")){
                text = text.substring(0, text.indexOf("'"))+"'"+text.substring(text.indexOf("'"), text.length());
            }
            rs = gm.execution(con, "SELECT * FROM grade WHERE LibGrade='"+text+"'");
            while(rs.next()){
                i = rs.getInt("IdGrade");
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
        return i;
    }
    public void recupererCorps(){
        try {
            cbCorps.removeAllItems();
            rs = gm.execution(con, "SELECT * FROM corps");
            while(rs.next()){
                cbCorps.addItem(rs.getString("Corp"));
            }
        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }
    private void cbGradeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbGradeItemStateChanged
        /*if(cbGrade.getSelectedItem().toString()==null || cbGrade.getSelectedItem().toString()==""){
            
        }else{
            afficher(String.valueOf(recupererIdGrade(cbGrade.getSelectedItem().toString())));
        }*/
    }//GEN-LAST:event_cbGradeItemStateChanged

    private void rechKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyReleased
        recherche(table, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechKeyReleased

    private void rechKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rechKeyPressed
        recherche(table, con);
        // TODO add your handling code here:
    }//GEN-LAST:event_rechKeyPressed

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        recupererCorps();
    }//GEN-LAST:event_formInternalFrameActivated

    private void cbCorpsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbCorpsPropertyChange
        afficher("Corps = '"+cbCorps.getSelectedItem().toString()+"'");
    }//GEN-LAST:event_cbCorpsPropertyChange

    private void cbGradePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbGradePropertyChange
        afficher("IdGrade="+recupererIdGrade(cbGrade.getSelectedItem().toString()));
    }//GEN-LAST:event_cbGradePropertyChange

    public void charger(String lib, String text, String file,String params){
        InputStream inputStream = null;
        try {
            HashMap mesParametres = new HashMap();
            mesParametres.put(lib, params);
            mesParametres.put("text", text);
            String scr = "src/view/"+file+".jrxml";
            inputStream = new FileInputStream(scr);
            //JasperDesign jasperDesign = JRXmlLoader.load(scr);
            JasperReport jasperReport = JasperCompileManager.compileReport(inputStream);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, mesParametres, new Connexion().open());
            JasperExportManager.exportReportToPdfFile(jasperPrint, "Facture.pdf");
            JRViewer view = new JRViewer(jasperPrint);
            JDialog frame = new JDialog();
            frame.getContentPane().add(view);
            frame.setLocation(new java.awt.Point(50, 100));
            frame.setMinimumSize(new java.awt.Dimension(990, 570));
            frame.setSize(800, 600);
            frame.setVisible(true);
        }catch(FileNotFoundException | JRException ex) {
            System.out.println(ex.toString());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btImprimer;
    private javax.swing.JButton btnModif;
    private javax.swing.JComboBox<String> cbCorps;
    private javax.swing.JComboBox<String> cbGrade;
    private javax.swing.JComboBox<String> cbType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField rech;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
