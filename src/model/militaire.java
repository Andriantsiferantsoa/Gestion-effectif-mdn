
package model;

/**
 *
 * @author Andry Andriantsiferantsoa
 */
public class militaire {
    private String IdMilt;
    private int IdGrade;
    private String PhotoMilt;
    private String NomMilt;
    private String Promotion;
    private String DateEntrServ;
    private String Sexe;
    private String Statut;
    private String Arme;
    private String Specialite;
    private String NumMatr;
    private String MatrFinance;
    private String CIN;
    private String Corps;
    private String Compagnie;
    private String DateNaiss;
    private String Position;
    private String RefPosition;
    
    
    public militaire(){
    
    }
    public militaire(String IdMilt,int IdGrade,String PhotoMilt,String NomMilt,String Promotion,String DateEntrServ,String Sexe,String Statut,String Arme,String Specialite,String NumMatr,String MatrFinance,String CIN,String Corps,String Compagnie,String DateNaiss,String Position,String RefPosition){
        this.IdMilt = IdMilt;
        this.IdGrade = IdGrade;
        this.PhotoMilt = PhotoMilt;
        this.NomMilt = NomMilt;
        this.Promotion = Promotion;
        this.DateEntrServ = DateEntrServ;
        this.Sexe = Sexe;
        this.Statut = Statut;
        this.Arme = Arme;
        this.Specialite = Specialite;
        this.NumMatr = NumMatr;
        this.MatrFinance = MatrFinance;
        this.CIN = CIN;
        this.Corps = Corps;
        this.Compagnie = Compagnie;
        this.DateNaiss = DateNaiss;
        this.Position = Position;
        this.RefPosition = RefPosition;
       }

    public int getIdGrade() {
        return IdGrade;
    }

    public void setIdGrade(int IdGrade) {
        this.IdGrade = IdGrade;
    }

    public String getIdMilt() {
        return IdMilt;
    }

    public void setIdMilt(String IdMilt) {
        this.IdMilt = IdMilt;
    }

    public String getPhotoMilt() {
        return PhotoMilt;
    }

    public void setPhotoMilt(String PhotoMilt) {
        this.PhotoMilt = PhotoMilt;
    }

    public String getNomMilt() {
        return NomMilt;
    }

    public void setNomMilt(String NomMilt) {
        this.NomMilt = NomMilt;
    }

    public String getPromotion() {
        return Promotion;
    }

    public void setPromotion(String Promotion) {
        this.Promotion = Promotion;
    }

    public String getDateEntrServ() {
        return DateEntrServ;
    }

    public void setDateEntrServ(String DateEntrServ) {
        this.DateEntrServ = DateEntrServ;
    }

    public String getSexe() {
        return Sexe;
    }

    public void setSexe(String Sexe) {
        this.Sexe = Sexe;
    }

    public String getStatut() {
        return Statut;
    }

    public void setStatut(String Statut) {
        this.Statut = Statut;
    }

    public String getArme() {
        return Arme;
    }

    public void setArme(String Arme) {
        this.Arme = Arme;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String Specialite) {
        this.Specialite = Specialite;
    }

    public String getNumMatr() {
        return NumMatr;
    }

    public void setNumMatr(String NumMatr) {
        this.NumMatr = NumMatr;
    }

    public String getMatrFinance() {
        return MatrFinance;
    }

    public void setMatrFinance(String MatrFinance) {
        this.MatrFinance = MatrFinance;
    }

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getCorps() {
        return Corps;
    }

    public void setCorps(String Corps) {
        this.Corps = Corps;
    }

    public String getCompagnie() {
        return Compagnie;
    }

    public void setCompagnie(String Compagnie) {
        this.Compagnie = Compagnie;
    }

    public String getDateNaiss() {
        return DateNaiss;
    }

    public void setDateNaiss(String DateNaiss) {
        this.DateNaiss = DateNaiss;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String Position) {
        this.Position = Position;
    }

    public String getRefPosition() {
        return RefPosition;
    }

    public void setRefPosition(String RefPosition) {
        this.RefPosition = RefPosition;
    }
    
}
