package aff;
import humain.*;
import location.*;
import javax.swing.*;

import java.awt.*;

public class Dessin extends JPanel {
    Hopital h;

    public Dessin(Hopital h1){
        this.h = h1;
        this.setLayout(null);
    }
    public void afficherChamps( Personne p) {
        this.removeAll();

        JTextField textFieldx = new JTextField(Double.toString(p.getX()));
        JTextField textFieldy = new JTextField(Double.toString(p.getY()));

        textFieldx.setBounds(10, 10, 100, 25);
        textFieldy.setBounds(10, 45, 100, 25);
        this.add(textFieldx);
        this.add(textFieldy);

        JButton button = new JButton("Deplacer");
        button.setBounds(10, 80, 100, 25);
        button.addActionListener(e -> {
            // removeAll();
            Graphics g = this.getGraphics();
            
            try {
                double newX = Double.parseDouble(textFieldx.getText());
                double newY = Double.parseDouble(textFieldy.getText());
                p.paintMovement(g, newX, newY, 70);
                
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
            act.dessiner(g,70);
        }
        for (int i = 0; i < h.getTabPersonne().size(); i++) {
            Personne p = (Personne) h.getTabPersonne().elementAt(i);
            p.drawPersonne(g,70);
        }
        

    }
}
