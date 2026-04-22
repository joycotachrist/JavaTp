package accesoire;

import java.awt.event.*;

import javax.swing.*;

import aff.*;
import humain.Personne;
import location.*;

import java.awt.*;

public class Ecouteur implements MouseMotionListener, MouseListener {
    Fenetre f;
    Dessin d;

    public Ecouteur(Fenetre j,Dessin d) {
        f = j;
        this.d = d;
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExcited");
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed x=" + e.getX() + " y=" + e.getY());
        int x_cl = e.getX();
        int y_cl = e.getY();

        for (int i = 0; i < f.getHopital().getTabPersonne().size(); i++) {
            Personne p = (Personne) f.getHopital().getTabPersonne().elementAt(i);

            int px = (int) (p.getX() * f.getScale() + 5);
            int py = (int) (p.getY() * f.getScale() + 5);

            if (Math.abs(x_cl - px) <= 5 && Math.abs(y_cl - py) <= 5) {
                System.out.println("Vous avez cliqué sur " + p.getNom());
                d.afficherChamps(p);
                
                break;
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseRelassed");
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked dhiuzahduiazhiduh");
    }

    public void mouseMoved(MouseEvent e) {
        System.out.println("MouseMoved");
    }

    public void mouseDragged(MouseEvent e) {
        System.out.println("Draggg " + e.getX() + " et " + e.getY());
    }
}
