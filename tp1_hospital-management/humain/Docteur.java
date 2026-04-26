package humain;

import accesoire.*;
import location.*;

public class Docteur extends Personne {

    protected Maladie[] specialite;

    public Docteur(String nom, Date nai) {
        this.nom = nom;
        if (nai.Age() >= 18 && nai.Age() < 100) {
            this.dtn = nai;
        }

    }
    // public void setDtn(Date naissance) {
    // if (naissance.Age() >= 18 && naissance.Age() <100) {
    // this.dtn = naissance;
    // }
    // }

    public void setSpecialite(Maladie[] specialite) {
        this.specialite = specialite;
    }

    public Maladie[] getSpecialite() {
        return specialite;
    }

    public void verifierEtAfficher() {
        System.out.println("Docteur : " + this.nom);
        if (this.dtn.Age() >= 18 && this.dtn.Age() < 100) {
            System.out.println("Nee le : " + this.dtn.getJ() + "/" + this.dtn.getM() + "/" + this.dtn.getA());
            System.out.println("Age : " + this.dtn.Age() + " -> Accepte");
        } else {
            System.out.println("Age : " + this.dtn.Age() + " -> Refuse");

        }
    }

    public int dans_ses_corde(Maladie m1) {
        for (int i = 0; i < specialite.length; i++) {
            if (specialite[i] != null && m1.getId() == specialite[i].getId()) {
                return 1;
            }
        }
        return 0;
    }

    public void treat(Patient p1) {
        for (int i = 0; i < p1.maladieAct.length; i++) {
            if (p1.maladieAct[i] != null && p1.maladieNiveau[i] > 0) {
                if (this.dans_ses_corde(p1.maladieAct[i]) == 1) {
                    p1.maladieNiveau[i]--;
                }
            }
        }
    }

    public void TraiterAll(Patient p1, Hopital h1) {
        if (this.dtn != null || (this.dtn.Age() >= 18 && this.dtn.Age() < 100)) {
            if (p1.DansQuelleChambre(h1) == this.DansQuelleChambre(h1)) {
                System.out.println("Le Docteur " + this.nom + " traite le patient " + p1.nom);

                for (int i = 0; i < p1.maladieAct.length; i++) {
                    if (p1.maladieAct[i] != null && p1.maladieNiveau[i] > 0) {
                        if (this.dans_ses_corde(p1.maladieAct[i]) == 1) {
                            p1.maladieNiveau[i]--;
                        }
                    }
                }

            } else {
                this.deplacer(p1.x - this.getX(), p1.y - this.getY());
                if (p1.DansQuelleChambre(h1) == this.DansQuelleChambre(h1)) {
                    for (int i = 0; i < p1.maladieAct.length; i++) {
                        if (p1.maladieAct[i] != null && p1.maladieNiveau[i] > 0) {
                            if (this.dans_ses_corde(p1.maladieAct[i]) == 1) {
                                p1.maladieNiveau[i]--;
                            }
                        }
                    }
                }

            }

        }

    }

    public void guerrirMemeChambre(Hopital h1) {
        for (int i = 0; i < h1.getTabPersonne().size(); i++) {
            Personne p = (Personne)h1.getTabPersonne().elementAt(i);
            if (this.DansQuelleChambre(h1) == p.DansQuelleChambre(h1)) {
                if (p instanceof Patient) {
                    this.treat((Patient) p);
                }
            }
        }
    }

    public void show() {
        super.show();
        if (this.dtn == null) {

            System.out.println("C'est ni un patient ni un Docteur");
        } else {
            System.out.println("---> C'est un Medecin");
            System.out.println("\n Voici ces specialites : ");
            for (int i = 0; i < specialite.length; i++) {
                System.out.println("-" + specialite[i].nomMaladie);
            }
        }

    }
}
