package aff;

import javax.swing.*;

import org.w3c.dom.events.MouseEvent;

import accesoire.Ecouteur;

import java.awt.*;

import location.Hopital;

public class Fenetre extends JFrame {
    // JButton bt = new JButton();
    Hopital hopital;
    int scale;

    public Hopital getHopital() {
        return hopital;
    }

    public int getScale() {
        return scale;
    }

    public Fenetre(Hopital h2) {
        this.hopital = h2;
        this.scale = 70;
        this.setTitle("Hopital");
        this.setSize(1000, 1000);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Dessin d = new Dessin(h2);
        // d.setLayout(new FlowLayout());
        d.setBackground(new Color(119,136,153));
        add(d);
        this.setVisible(true);

        d.addMouseListener(new Ecouteur(this, d));

        // bt.setSize(67, 67);

        // bt.setText("ajouter");
        // bt.addMouseListener(new Ecouteur(this));
        // add(bt);

    }
}
