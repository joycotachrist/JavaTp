package accesoire;

public class Prise {
    Medicament pris;
    Date DatedePrise;

    public Date getDatedePrise() {
        return DatedePrise;
    }
    public Medicament getPris() {
        return this.pris;
    }
    public void setDatedePrise(Date datedePrise) {
        DatedePrise = datedePrise;
    }
    public void setPris(Medicament pris) {
        this.pris = pris;
    }
}
