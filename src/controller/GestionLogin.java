
package controller;

import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Connexion;
import model.Login;
/**
 *
 * @author Andry Andriantsiferantsoa
 */
public class GestionLogin {
    public PreparedStatement ps;
    public ResultSet rs;
    public Connexion con = new Connexion();
    
    
    public GestionLogin(){
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
    public void insertLogin(Connexion con , Login lg) throws SQLException{
        
        try{
       String req = "INSERT INTO login(IdUser , Login , MdPass , Privilege) values (?,?,?,?)";
       ps = (PreparedStatement) con.open().prepareStatement(req);
       ps.setString(1, lg.getIdUser());
       ps.setString(2, lg.getLogin());
       ps.setString(3, lg.getMdPass());
       ps.setString(4, lg.getPrivilege());
       ps.execute();
        JOptionPane.showMessageDialog(null, "L'utilisateur: "+lg.getLogin()+"avec une privillege "+lg.getPrivilege()+" est ajoutée avec succèss");
    } catch (HeadlessException e){
            System.out.println(e.toString());
        }
        finally{
            con.close();
        }
    }
    
  public void listerLogin(javax.swing.JTable table,Connexion con ){
  DefaultTableModel model = new DefaultTableModel();
  model.addColumn("Identifiant");
  model.addColumn("Nom D'utilisateur");
  model.addColumn("Mot de passe");
  model.addColumn("privillege");
  table.setModel(model);
  
  String req = "SELECT *FROM login";
          try{
             rs =execution (con , req);
             while(rs.next()){
             String IdUser = rs.getString("IdUser");
             String Login = rs.getString("Login");
             String MdPass = rs.getString("MdPass");
             String Privilege = rs.getString("Privilege");
             Object []ligne = {IdUser,Login,MdPass,Privilege};
                    model.addRow(ligne);
             }
             
          }  catch (Exception e){}
  }
  
  public void SupprimerLogin(Connexion con ,String IdUser){
        try {
       ps = (PreparedStatement) con.open().prepareStatement("DELETE FROM login WHERE IdUser = ?");
       ps.setString(1, IdUser);
       ps.execute();
        }catch (Exception e) {
        }
  }
  
   public void modifierlogin(Connexion con , Login lg,String IdUser){
        try{
        String req = "UPDATE login SET Login = ?, MdPass = ?, Privilege = ? WHERE IdUser=?";
        ps = (PreparedStatement) con.open().prepareStatement(req);
        ps.setString(1, lg.getLogin());
        ps.setString(2, lg.getMdPass());
        ps.setString(3, lg.getPrivilege());
        ps.setString(4, IdUser);
        ps.execute();
        con.close();
        JOptionPane.showMessageDialog(null, "Modification réussie");
        }catch(SQLException ex){
            System.out.println(ex.toString());
            //System.out.println(ex.getMessage());
        } 
   
   }
    
}


