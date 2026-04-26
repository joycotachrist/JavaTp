package aff;
import humain.*;
import location.*;
import javax.swing.*;
import java.io.*;

import java.awt.*;

public class Dessin extends JPanel {
     Hopital h;


    public Dessin(Hopital h1){
        this.h = h1;
        this.setLayout(null);
    }
    public void afficherChamps( Personne p) {
        //  System.out.println("getHeight() = " + getHeight());
        this.removeAll();
        JLabel selectedP = new JLabel("Vous avez selectionnes "+p.getNom());

        JTextField textFieldx = new JTextField(Double.toString(p.getX()));
        JTextField textFieldy = new JTextField(Double.toString(p.getY()));
        
        selectedP.setBounds(10,5,200,25);
        textFieldx.setBounds(10, 30, 100, 25);
        textFieldy.setBounds(10, 65, 100, 25);
        this.add(selectedP);
        this.add(textFieldx);
        this.add(textFieldy);

        JButton button = new JButton("Deplacer");
        button.setBounds(10, 100, 100, 25);
        button.addActionListener(e -> {
            // removeAll();
            Graphics g = this.getGraphics();
            
            try {
                double newX = Double.parseDouble(textFieldx.getText());
                double newY = Double.parseDouble(textFieldy.getText());
                p.paintMovement(g, newX, newY, 70, getHeight());
                h.check();
                h.WriteinFile("hopital");
                repaint(); 

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer des valeurs numériques valides.");
            }
        });
        this.add(button);   
        this.repaint();
        
    }
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < h.getToutLesChambres().size(); i++) {
            Chambre act = (Chambre) h.getToutLesChambres().elementAt(i);
            act.dessiner(g,70,getHeight());
        }
        for (int i = 0; i < h.getTabPersonne().size(); i++) {
            Personne p = (Personne) h.getTabPersonne().elementAt(i);
            p.drawPersonne(g,70,getHeight());
        }

    }
}
