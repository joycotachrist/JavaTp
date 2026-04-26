package accesoire;

import humain.Maladie;

public class Medicament {
    String nomMedicament;
    double Prix;
    Maladie[] sitranina;
    Date peremption;
    int marge;

    public String getNomMedicament() {
        return nomMedicament;
    }

    public int getMarge() {
        return marge;
    }

    public Date getPeremption() {
        return peremption;
    }

    public double getPrix() {
        return Prix;
    }

    public Maladie[] getSitranina() {
        return sitranina;
    }

    public void setMarge(int marge) {
        this.marge = marge;
    }

    public void setNomMedicament(String nomMedicament) {
        this.nomMedicament = nomMedicament;
    }

    public void setPeremption(Date peremption) {
        this.peremption = peremption;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }

    public void setSitranina(Maladie[] sitranina) {
        this.sitranina = sitranina;
    }
}
