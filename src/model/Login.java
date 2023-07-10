
package model;

/**
 *
 * @author Andry Andriantsiferantsoa
 */
public class Login {
    private String IdUser;
    private String Login;
    private String MdPass;
    private String Privilege;
    
    
    public Login(){
    
    }
    
    
    public Login (String IdUser,String Login,String MdPass,String Privilege){
           this.IdUser = IdUser;
           this.Login = Login;
           this.MdPass = MdPass;
           this.Privilege = Privilege;
    }

    public String getIdUser() {
        return IdUser;
    }

    public void setIdUser(String IdUser) {
        this.IdUser = IdUser;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getMdPass() {
        return MdPass;
    }

    public void setMdPass(String MdPass) {
        this.MdPass = MdPass;
    }

    public String getPrivilege() {
        return Privilege;
    }

    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }
}
