
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Connexion;
import model.Login;
import model.militaire;

/**
 *
 * @author Andry Andriantsiferansoa
 */
public class gestionMilitaire {
    public PreparedStatement ps;
    public ResultSet rs;
    public Connexion con = new Connexion();
    
    
    public gestionMilitaire(){
    }
    
    
    public ResultSet execution(Connexion con , String requete){
        try { 
            ps = (PreparedStatement) con.open().prepareStatement(requete);
            rs = ps.executeQuery();
        }catch (Exception e){
            System.out.println(e.toString());
            }
        return rs;
    }
    
    
    public void listerMilitaire(javax.swing.JTable table,Connexion con){
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
        
        
            String req = "SELECT * FROM militaire";
        try{
             rs =execution (con , req);
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
    public void insertMilitaire (Connexion con , militaire m ){
        try{
            // Connection connect= con.open();
        String req = "INSERT INTO militaire(IdMilt,IdGrade,PhotoMilt,NomMilt,Promotion,DateEntrServ,Sexe,Statut,Arme,Specialite,NumMatr,MatrFinance,CIN,Corps,Compagnie,DateNaiss,Position,RefPosition) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        ps = (PreparedStatement) con.open().prepareStatement(req);
        ps.setString(1, m.getIdMilt());
        ps.setInt(2, m.getIdGrade());
        ps.setString(3, m.getPhotoMilt());
        ps.setString(4, m.getNomMilt());
        ps.setString(5, m.getPromotion());
        ps.setString(6, m.getDateEntrServ());
        ps.setString(7, m.getSexe());
        ps.setString(8, m.getStatut());
        ps.setString(9, m.getArme());
        ps.setString(10, m.getSpecialite());
        ps.setString(11,m.getNumMatr());
        ps.setString(12, m.getMatrFinance());
        ps.setString(13, m.getCIN());
        ps.setString(14, m.getCorps());
        ps.setString(15, m.getCompagnie());
        ps.setString(16, m.getDateNaiss());
        ps.setString(17, m.getPosition());
        ps.setString(18, m.getRefPosition());
        
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Ajout reussi");
        } catch (Exception e){
            System.out.println(e.toString());
        }
        finally{
            con.close();
        }
        
    }
    
    
    public void listerEffecf(javax.swing.JTable table,Connexion con){
        DefaultTableModel model = new DefaultTableModel();
        //model.addColumn("Identifiant");
       // model.addColumn("Photo");
        model.addColumn("GRADE");
        model.addColumn("EFFECTIF");
        table.setModel(model);
        
        
            String req = "SELECT grade.LibGrade as grd, COUNT(*) as effectif FROM militaire, grade WHERE grade.IdGrade=militaire.IdGrade GROUP BY grade.IdGrade ";
        try{
             rs =execution (con , req);
             while(rs.next()){
            // String IdMilt = rs.getString("IdMilt");
            // String PhotoMilt = rs.getString("PhotoMilt");
             String GRD = rs.getString("grd");
             String EFC = rs.getString("effectif");
Object []ligne = {GRD,EFC};
                    model.addRow(ligne);
             }
             
          }  catch (Exception e){}
    }
    
    public void modifierMilt(Connexion con , militaire m,String IdMilt){
        try{
        String req = "UPDATE militaire SET  PhotoMilt = ?, NomMilt = ?, Promotion = ?, DateEntrServ = ?, Sexe = ?, Statut = ?, Arme = ?, Specialite = ?, NumMatr = ?, MatrFinance = ?, CIN = ?, Corps = ?, Compagnie = ?, DateNaiss = ?, Position = ?, RefPosition = ? WHERE IdMilt=?";
        ps = (PreparedStatement) con.open().prepareStatement(req);
        ps.setString(1, m.getPhotoMilt());
        ps.setString(2, m.getNomMilt());
        ps.setString(3, m.getPromotion());
        ps.setString(4, m.getDateEntrServ());
        ps.setString(5, m.getSexe());
        ps.setString(6, m.getStatut());
        ps.setString(7, m.getArme());
        ps.setString(8, m.getSpecialite());
        ps.setString(9, m.getNumMatr());
        ps.setString(10, m.getMatrFinance());
        ps.setString(11, m.getCIN());
        ps.setString(12, m.getCorps());
        ps.setString(13, m.getCompagnie());
        ps.setString(14, m.getDateNaiss());
        ps.setString(15, m.getPosition());
        ps.setString(16, m.getRefPosition());
        ps.setString(17, IdMilt);
        ps.execute();
        con.close();
        JOptionPane.showMessageDialog(null, "Modification réussie");
        }catch(SQLException ex){
            System.out.println(ex.toString());
            //System.out.println(ex.getMessage());
        } 
   
   }
    
    public void SupprimerMilitaire(Connexion con ,String IdMilt){
        try {
       ps = (PreparedStatement) con.open().prepareStatement("DELETE FROM militaire WHERE IdMilt = ?");
       ps.setString(1, IdMilt);
       ps.execute();
       con.close();
        JOptionPane.showMessageDialog(null, "Suppression réussie");
        }catch (Exception e) {
        }
  }
    
   public void Promotion(Connexion con , militaire m,String IdMilt){
        try{
        String req = "UPDATE militaire SET  IdGrade = ? WHERE IdMilt=?";
        ps = (PreparedStatement) con.open().prepareStatement(req);
        ps.setInt(1, m.getIdGrade());
        ps.setString(2, IdMilt);
        ps.execute();
        con.close();
        JOptionPane.showMessageDialog(null, "Promotion avec succes réussie");
        }catch(SQLException ex){
            System.out.println(ex.toString());
        } 
   
   }
    
}
