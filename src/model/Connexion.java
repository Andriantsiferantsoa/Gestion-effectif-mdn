

package model;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Andry Andriantsiferantsoa
 */
public class Connexion {
    String filename =null;
    public static String path;
    public Connection connect;
    public Parameter p= new Parameter();
    public Connexion (){}
    static PreparedStatement ps;
    static ResultSet rs;
    public Connection open (){
        try {
            connect = (Connection) DriverManager.getConnection(p.url,p.user,p.password);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return connect;
    }
   public Connection close(){
        try {
            connect.close();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return connect;
    
}

    public PreparedStatement preparedStatement(String req) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void filen(){
        
        try{
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Choisir une image png");
        chooser.setApproveButtonText("Ajouter une image");
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        this.path =(filename);
            }catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null, "Veillez Choisir une image");
            }
    
    }
    public String getp(){
        return path;
    }
}
