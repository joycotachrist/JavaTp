package humain;

import accesoire.*;

public class Patient extends Personne {

    
    protected Maladie[] antecedents;
    protected Maladie[] mitaiza;
    protected Maladie[] maladieAct;
    protected int[] maladieNiveau;
    protected Patient next;
    protected Patient back;
    protected Prise[] mesMedocs;
    protected Medicament[] efaNoanina;

    public Patient getBack() {
        return back;
    }

    public Patient getNext() {
        return next;
    }

    public void setBack(Patient back) {
        this.back = back;
    }

    public void setNext(Patient next) {
        this.next = next;
    }

    public Maladie[] getAntecedents() {
        return antecedents;
    }

    

    public Medicament[] getEfaNoanina() {
        return efaNoanina;
    }

    public Prise[] getMesMedocs() {
        return mesMedocs;
    }

    public Maladie[] getMitaiza() {
        return mitaiza;
    }

 

   
    public void setMaladieAct(Maladie[] maladieAct) {
        
        this.maladieAct = maladieAct;
    }
   
    public int[] getMaladieNiveau() {
        return maladieNiveau;
    }

    public void setMaladieNiveau(int[] maladieNiveau) {
        
        this.maladieNiveau = maladieNiveau;
    }

    public void setAntecedents(Maladie[] antecedents) {
        this.antecedents = antecedents;
    }

  
    public void setEfaNoanina(Medicament[] efaNoanina) {
        this.efaNoanina = efaNoanina;
    }

    public void setMesMedocs(Prise[] mesMedocs) {
        this.mesMedocs = mesMedocs;
    }

    public void setMitaiza(Maladie[] mitaiza) {
        this.mitaiza = mitaiza;
    }
public Patient(Maladie[] maladies, int[] niveau){
    for (int i = 0; i < niveau.length; i++) {
        if (niveau[i] <= 0 ) {
            maladies[i] = null;
        }
    }
    this.maladieAct = maladies;
    this.maladieNiveau = niveau;
}
public Maladie[] getMaladieAct() {
    return maladieAct;
}
public Maladie[] getMaladieAct2() {
    
    int count = 0;
    for (int i = 0; i < this.maladieAct.length; i++) {
        if (this.maladieAct[i] != null && this.maladieNiveau[i] >0) {
            count++;
        }
    }
    Maladie[] copie = new Maladie[count];
    int l = 0;

    for (int i = 0; i < this.maladieAct.length; i++) {
        if (this.maladieAct[i] != null && this.maladieNiveau[i] >0) {
            copie[l] = this.maladieAct[i];
            l++;
        }
    }

    return copie;
}

    // public void Show_patient() {
    //     System.out.println("==================================");

    //     System.out.println("Patient : " + this.nom);
    //     System.out.println("Nee le " + dtn.getJ() + '/' + dtn.getM() + '/' + dtn.getA());
    //     System.out.println("Aretina mitaiza : ");
    //     if (this.mitaiza != null) {
    //         for (int i = 0; i < this.mitaiza.length; i++) {
    //             System.out.println("-" + this.mitaiza[i].getNomMaladie());
    //         }
    //     } else {
    //         System.out.println("\"Aucune aretina mitaiza\".");
    //     }

    //     System.out.println("Antecedents : ");
    //     for (int i = 0; i < this.antecedents.length; i++) {
    //         System.out.println("-" + this.antecedents[i].getNomMaladie());
    //     }
    //     System.out.println("Medicaments Prise : ");
    //     int countAllMed = 0;
    //     for (int i = 0; i < mesMedocs.length && mesMedocs[i] != null; i++) {
    //         if (mesMedocs[i] == null) {
    //             countAllMed++;
    //         }
    //         System.out.println("Medicament " + " : " + mesMedocs[i].getPris().getNomMedicament());
    //         System.out.println("Date de prise : " + mesMedocs[i].getDatedePrise().getJ() + '/'
    //                 + mesMedocs[i].getDatedePrise().getM() + '/'
    //                 + mesMedocs[i].getDatedePrise().getA());
    //     }
    //     if (countAllMed >= mesMedocs.length) {
    //         System.out.println("Tsisy medicament prise");
    //     }
    //     System.out.println("==================================");
    // }

    // public void Show_All_patient() {
    //     this.Show_patient();
    //     if (this.next == null) {
    //         return;
    //     } else {
    //         this.next.Show_All_patient();
    //     }
    // }
   
public void ShowMaladies(){
    for (int i = 0; i < this.getMaladieAct2().length; i++) {
       System.out.println( "-"+ this.getMaladieAct2()[i].getNomMaladie());
    }
}
    public void show() {
        super.show();
        System.out.println("---> C'est un Patient");
        System.out.println("\n Maladie : ");
        for (int i = 0; i < maladieAct.length; i++) {
            if (maladieAct[i] != null) {
                System.out.println("-" + maladieAct[i].getNomMaladie() + " Niveau " + maladieNiveau[i]);
            }
        }
      

    }
    // void ajouter1Med(Medicament m) {
    // int count = 0;
    // int i = 0;
    // while (this.efaNoanina[i] != null) {
    // i++;
    // count++;
    // }
    // if (count < this.efaNoanina.length) {
    // this.efaNoanina[count] = m;
    // return;
    // } else if (count >= this.efaNoanina.length) {
    // Medicament[] avalee = new Medicament[this.efaNoanina.length * 2];
    // for (int j = 0; j < efaNoanina.length; j++) {
    // avalee[j] = this.efaNoanina[j];
    // }
    // avalee[count] = m;
    // this.efaNoanina = avalee;
    // }
    // }
    public void ajouter1Med(Medicament m, Date di) {
        int count = 0;
        m.getPeremption().ajouterJour(-m.getMarge());
        if (di.compareDate(m.getPeremption()) == 2 || di.compareDate(m.getPeremption()) == 0) {
            for (int i = 0; i < this.mesMedocs.length; i++) {
                if (this.mesMedocs[i] != null) {
                    count++;
                } else {
                    break;
                }
            }
            if (count < this.mesMedocs.length) {
                this.mesMedocs[count] = new Prise();
                this.mesMedocs[count].setPris(m);
                this.mesMedocs[count].setDatedePrise(di);
                return;
            } else {
                Prise[] avalee = new Prise[this.mesMedocs.length * 2];
                for (int j = 0; j < mesMedocs.length; j++) {
                    avalee[j] = this.mesMedocs[j];
                }
                avalee[count] = new Prise();
                avalee[count].setPris(m);
                avalee[count].setDatedePrise(di);
                this.mesMedocs = avalee;
            }
        }
    }

    public void avalerM(Medicament[] ms, Date prise) {
        for (int i = 0; i < ms.length; i++) {
            ajouter1Med(ms[i], prise);
        }
    }

}
