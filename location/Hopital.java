package location;

import java.util.Vector;
import accesoire.*;
import aff.Fenetre;
import humain.*;

public class Hopital {
    Vector tabPersonne;
    Vector toutLesChambres;

    public Vector getTabPersonne() {
        return tabPersonne;
    }

    public Vector getToutLesChambres() {
        return toutLesChambres;
    }

    public void setTabPersonne(Vector tabPersonne) {
        this.tabPersonne = tabPersonne;
    }

    public void setToutLesChambres(Vector toutLesChambres) {
        this.toutLesChambres = toutLesChambres;
    }

    public void AfficherTout() {
        for (int i = 0; i < tabPersonne.size(); i++) {
            Personne act = (Personne) tabPersonne.elementAt(i);
            act.show();
            if (act.DansQuelleChambre(this) != -1) {
                System.out.println("Dans la chambre numero : " + act.DansQuelleChambre(this));
            } else {
                System.out.println("Pas dans une chambre");
            }
        }
    }

    public void check() {
        for (int i = 0; i < toutLesChambres.size(); i++) {
            Chambre act = (Chambre) toutLesChambres.elementAt(i);
            int count = 0;
            System.out.println("Dans la Chambre numero : " + act.getNumero() + "se trouve : ");
            for (int j = 0; j < tabPersonne.size(); j++) {
                Personne p = (Personne) tabPersonne.elementAt(j);
                if (act.getNumero() == p.DansQuelleChambre(this)) {
                    count++;
                    System.out.println("-" + p.getNom() + " (" + p.getX() + "," + p.getY() + ")");

                }
            }
            if (count <= 0) {
                System.out.println("Aucune Personne \n");
            }
        }
    }

    public Vector[] check2() {
        Vector v[] = new Vector[toutLesChambres.size()];
        for (int i = 0; i < toutLesChambres.size(); i++) {
            v[i] = new Vector();
            Chambre act = (Chambre) toutLesChambres.elementAt(i);
            for (int j = 0; j < tabPersonne.size(); j++) {
                Personne p = (Personne) tabPersonne.elementAt(j);
                if (act.getNumero() == p.DansQuelleChambre(this)) {
                    v[i].add(p);
                }
            }
        }
        return v;
    }
    public void showV() {
        Vector v[] = this.check2();
        for (int i = 0; i < v.length; i++) {
            Chambre act = (Chambre) toutLesChambres.elementAt(i);
            int count = 0;
            System.out.println("Dans la Chambre numero : " + act.getNumero() + " se trouve : ");
            for (int j = 0; j < v[i].size(); j++) {
                Personne p = (Personne) v[i].elementAt(j);
                count++;
                if (p instanceof Patient) {
                    System.out.println("-Patient : " + p.getNom() + " (" + p.getX() + " ; " + p.getY() + ") ");
                }else if (p instanceof Docteur) {
                    System.out.println("-Docteur : " + p.getNom() + " (" + p.getX() + " ; " + p.getY() + ") ");
                } else {
                    System.out.println("-" + p.getNom() + " (" + p.getX() + " ; " + p.getY() + ") ");
                }
                
            }
            if (count <= 0) {
                System.out.println("Aucune Personne \n");
            }
        }
    }


}
