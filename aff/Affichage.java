package aff;

import java.util.Vector;
import accesoire.*;
import humain.*;
import location.*;

public class Affichage {
    public static void main(String[] args) {

        // ==================== MALADIES ====================
        Maladie m1 = new Maladie();
        m1.setId(1);
        m1.setNomMaladie("Areti kibo");
        m1.setEst_mortelle(true);
        m1.setDanger(5);
        m1.setTransmission("Hereditaire");

        Maladie m2 = new Maladie();
        m2.setId(2);

        m2.setNomMaladie("Aretina Loha");
        m2.setEst_mortelle(true);
        m2.setDanger(3);
        m2.setTransmission("Respiratoire");

        Maladie m3 = new Maladie();
        m3.setId(3);

        m3.setNomMaladie("Aretin-tsaina");
        m3.setEst_mortelle(true);
        m3.setDanger(2);
        m3.setTransmission("Respiratoire");
        Maladie m4 = new Maladie();
        m4.setId(4);

        m4.setNomMaladie("Aretina vavony");
        m4.setEst_mortelle(true);
        m4.setDanger(2);
        m4.setTransmission("Respiratoire");
        Maladie m5 = new Maladie();
        m5.setId(5);

        m5.setNomMaladie("Aretim-po");
        m5.setEst_mortelle(true);
        m5.setDanger(2);
        m5.setTransmission("Respiratoire");

        // Maladie m4 = new Maladie();
        // m4.setId(4);

        // m4.setNomMaladie("Calvitie");
        // m4.setEst_mortelle(false);
        // m4.setDanger(0);
        // m4.setTransmission("Hereditaire");

        // Maladie m5 = new Maladie();
        // m5.setId(5);

        // m5.setNomMaladie("Cojonctivite");
        // m5.setEst_mortelle(false);
        // m5.setDanger(2);
        // m5.setTransmission("Contact physique");

        // ==================== MEDICAMENTS ====================
        // Medicament f1 = new Medicament();
        // f1.setPrix(1200);
        // f1.setNomMedicament("F1");
        // f1.setSitranina(new Maladie[] { m1, m3 });
        // f1.setPeremption(new Date(17, 3, 2026));
        // f1.setMarge(30);

        // Medicament f2 = new Medicament();
        // f2.setPrix(17000);
        // f2.setNomMedicament("F2");
        // f2.setSitranina(new Maladie[] { m1, m3 });
        // f2.setPeremption(new Date(13, 3, 2026));
        // f2.setMarge(30);

        // Medicament f3 = new Medicament();
        // f3.setPrix(2400);
        // f3.setNomMedicament("F3");
        // f3.setSitranina(new Maladie[] { m2, m4 });
        // f3.setPeremption(new Date(27, 3, 2026));
        // f3.setMarge(30);

        // Medicament f4 = new Medicament();
        // f4.setPrix(17000);
        // f4.setNomMedicament("F4");
        // f4.setSitranina(new Maladie[] { m1, m3 });
        // f4.setPeremption(new Date(28, 5, 2026));
        // f4.setMarge(30);

        // Medicament f5 = new Medicament();
        // f5.setPrix(2400);
        // f5.setNomMedicament("F5");
        // f5.setSitranina(new Maladie[] { m2, m4 });
        // f5.setPeremption(new Date(29, 3, 2026));
        // f5.setMarge(30);

        // ==================== PATIENTS ====================
        Maladie[] maladieMahazo = new Maladie[10];
        maladieMahazo[0] = m1;
        maladieMahazo[1] = m2;
        maladieMahazo[2] = m3;
        int[] niveau1 = new int[10];
        niveau1[0] = 4;
        niveau1[1] = -2;
        niveau1[2] = 7;
        Patient p1 = new Patient(maladieMahazo, niveau1);
        p1.setNom("P1");
        p1.setDtn(new Date(30, 1, 2001));
        p1.setSexe('M');
        p1.setMitaiza(new Maladie[] { m4 });
        p1.setAntecedents(new Maladie[] { m3, m2 });
        p1.setMesMedocs(new Prise[3]);
        p1.setEfaNoanina(new Medicament[3]);
        p1.setBack(null);
        p1.setPos(7, 3);
        Patient p2 = new Patient(maladieMahazo, niveau1);
        p2.setNom("P2");
        p2.setDtn(new Date(30, 1, 2001));
        p2.setSexe('M');
        p2.setMitaiza(new Maladie[] { m4 });
        p2.setAntecedents(new Maladie[] { m3, m2 });
        p2.setMesMedocs(new Prise[3]);
        p2.setEfaNoanina(new Medicament[3]);
        p2.setBack(null);
        p2.setPos(10, 7);
        Patient p3 = new Patient(maladieMahazo, niveau1);
        p3.setNom("P3");
        p3.setDtn(new Date(30, 1, 2001));
        p3.setSexe('M');
        p3.setMitaiza(new Maladie[] { m4 });
        p3.setAntecedents(new Maladie[] { m3, m2 });
        p3.setMesMedocs(new Prise[3]);
        p3.setEfaNoanina(new Medicament[3]);
        p3.setBack(null);
        p3.setPos(8, 11);
        Patient p4 = new Patient(maladieMahazo, niveau1);
        p4.setNom("p4");
        p4.setDtn(new Date(30, 1, 2001));
        p4.setSexe('M');
        p4.setMitaiza(new Maladie[] { m4 });
        p4.setAntecedents(new Maladie[] { m3, m2 });
        p4.setMesMedocs(new Prise[3]);
        p4.setEfaNoanina(new Medicament[3]);
        p4.setBack(null);
        p4.setPos(1, 2);

        // Patient p2 = new Patient(maladieMahazo,niveau1);
        // p2.setDtn(new Date(30, 2, 2001));
        // p2.setNom("Famonjena");
        // p2.setSexe('M');
        // p2.setMitaiza(null);
        // p2.setAntecedents(new Maladie[] { m5 });
        // p2.setMesMedocs(new Prise[3]);
        // p2.setEfaNoanina(new Medicament[3]);
        // p2.setNext(null);

        // p1.setNext(p2);
        // p2.setBack(p1);

        // ==================== PRISES ====================
        // Date dePrise = new Date(17, 2, 2026);

        // System.out.println("== Ajout medicaments pour p1 ==");
        // p1.ajouter1Med(f1, dePrise);
        // p1.ajouter1Med(f2, dePrise);
        // p1.ajouter1Med(f3, dePrise);
        // p1.ajouter1Med(f4, dePrise);
        // p1.ajouter1Med(f5, dePrise);

        // p1.Show_patient();

        // System.out.println("f5 peremption j+m = " + (f5.getPeremption().getJ() +
        // f5.getPeremption().getM()));
        // System.out.println(
        // "f3.peremption compareDate dePrise (attendu 1=apres) : " +
        // f3.getPeremption().compareDate(dePrise));

        // // ==================== Show_All_patient ====================
        // System.out.println("\n== Show All Patients ==");
        // p1.Show_All_patient();

        // ==================== DOCTEUR ====================
        System.out.println("\n===== TEST DOCTEUR =====");

        Docteur d1 = new Docteur("D1", new Date(12, 6, 2000));
        d1.setDtn(new Date(15, 3, 1980));
        d1.setSpecialite(new Maladie[] { m1, m2 });
        d1.setPos(4, 7);
        Docteur d2 = new Docteur("D2", new Date(3, 11, 2003));
        d2.setSpecialite(new Maladie[] { m4, m5 });
        d2.setPos(13, 6);
        Docteur d3 = new Docteur("D3", new Date(20, 10, 1994));
        d3.setSpecialite(new Maladie[] { m2, m3 });
        d3.setPos(12, 11);

        // Docteur d4 = new Docteur("D4", new Date(12, 03, 2010));
        // d4.setSpecialite(new Maladie[] { m1, m2 });

        // =========================MES MALADIES ==============================
        // d1.TraiterAll(p1);

        // d1.TraiterAll(p1);
        // d2.TraiterAll(p1);
        // d3.TraiterAll(p1);
        // // p1.ShowMaladies();
        // for (int i = 0; i < p1.getMaladieAct().length; i++) {
        // if (p1.getMaladieAct()[i] != null) {
        // System.out.println("-Maladie " + p1.getMaladieAct()[i].getId() + " "
        // + p1.getMaladieAct()[i].getNomMaladie() + " Niveau " +
        // p1.getMaladieNiveau()[i]);
        // }
        // }
        // d1.TraiterAll(p1);
        // d1.TraiterAll(p1);
        // d3.TraiterAll(p1);
        // d3.TraiterAll(p1);
        // d3.TraiterAll(p1);

        // for (int i = 0; i < p1.getMaladieAct().length; i++) {
        // if (p1.getMaladieAct()[i] != null) {
        // System.out.println("-Maladie " + p1.getMaladieAct()[i].getId() + " "
        // + p1.getMaladieAct()[i].getNomMaladie() + "Niveau " +
        // p1.getMaladieNiveau()[i]);
        // }
        // }

        Vector tabPersonne = new Vector();
        tabPersonne.add(p4);
        tabPersonne.add(p1);
        tabPersonne.add(p2);
        tabPersonne.add(p3);
        tabPersonne.add(d1);
        tabPersonne.add(d2);
        tabPersonne.add(d3);
        // tabPersonne.add(d4);

        Vector toutLesChambres = new Vector();
        Chambre c1 = new Chambre(1, 3, 5, 2, 3);
        toutLesChambres.add(c1);
        Chambre c2 = new Chambre(2, 5, 1, 2, 2);
        toutLesChambres.add(c2);
        Chambre c3 = new Chambre(3, 8, 4, 3, 4);
        toutLesChambres.add(c3);
        Hopital h = new Hopital();
        h.setTabPersonne(tabPersonne);
        h.setToutLesChambres(toutLesChambres);
        // h.AfficherTout();
        // d1.TraiterAll(p1, h);
        // d2.TraiterAll(p1, h);
        // d3.TraiterAll(p1, h);

        // for (int i = 0; i < p1.getMaladieAct().length; i++) {
        // if (p1.getMaladieAct()[i] != null) {
        // System.out.println("-Maladie " + p1.getMaladieAct()[i].getId() + " "
        // + p1.getMaladieAct()[i].getNomMaladie() + "Niveau " +
        // p1.getMaladieNiveau()[i]);
        // }
        // }
//         h.showV();//Afiche les personnes se trouvant dans chaque chambre
       
//         // d2.deplacer(-4, -1);//xactuele-4 , yactuelle-1
       
//         // p4.deplacer(5, 0);
      
       
//         // p1.deplacer(-1, -1);//
       
//         System.out.println("----------------------");
        
//         h.showV();//Afiche les personnes se tr0uvant dans chaque chambre
//         d3.deplacer(-2, -5);
//         d1.deplacer(2, 3);
//         System.out.println("----------------------");
// // 
//         h.showV();



        System.out.println("\nETU004658");
    Fenetre f = new Fenetre(h);
    

    }

}