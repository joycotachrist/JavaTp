package humain;

public class Maladie {
    int id;
    protected String nomMaladie;
    protected String transmission;
    protected boolean est_mortelle;
    protected int danger;

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }

    public void setEst_mortelle(boolean est_mortelle) {
        this.est_mortelle = est_mortelle;
    }

    public void setNomMaladie(String nomMaladie) {
        this.nomMaladie = nomMaladie;
    }

    public int getDanger() {
        return danger;
    }

    public String getNomMaladie() {
        return nomMaladie;
    }

    public String getTransmission() {
        return transmission;
    }

    public boolean getEstMortelle() {
        return est_mortelle;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public Maladie(){

    }
    public Maladie(int identidiant,String nom,boolean mortalite,int gravite){
        this.id = identidiant;
        this.nomMaladie =nom;
        this.est_mortelle = mortalite;
        this.danger = gravite;
    }

}
