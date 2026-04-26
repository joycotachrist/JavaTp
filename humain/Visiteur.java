package humain;
import accesoire.*;
import location.*;

public class Visiteur extends Personne{
     public Visiteur(String name,int px,int py){
        this.nom = name;
        this.x = px;
        this.y = py;
        this.sexe = 'H';
        this.dtn=new Date(12, 12, 2012);
    }
    
}
