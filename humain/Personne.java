package humain;

import java.util.Vector;
import accesoire.*;
import location.*;

import aff.Dessin;
import javax.swing.*;
import java.awt.*;

public class Personne {
    protected String nom;
    protected Date dtn;
    protected char sexe;
    protected double x;
    protected double y;

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }

    public String getNom() {
        return nom;
    }

    public char getSexe() {
        return sexe;
    }

    public Date getDtn() {
        return dtn;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setPos(double xx, double yy) {
        this.x = xx;
        this.y = yy;

    }

    public void deplacer(double vx, double vy) {
        setPos(this.getX() + vx, this.getY() + vy);
    }

    // public int DansQuelleChambre(Vector chambres) {
    // for (int i = 0; i < chambres.size(); i++) {
    // Chambre ch = (Chambre) chambres.elementAt(i);
    // if (ch.getDimension().contient(this.getX(), this.getY())) {
    // return ch.getNumero();
    // }
    // }
    // return -1;
    // }

    public int DansQuelleChambre(Hopital h1) {
        for (int i = 0; i < h1.getToutLesChambres().size(); i++) {
            Chambre ch = (Chambre) h1.getToutLesChambres().elementAt(i);
            if (ch.contient(this.getX(), this.getY())) {
                return ch.getNumero();
            }
        }
        return -1;
    }

    public int estDansChambre(Chambre ch) {
        if (ch.contient(this.getX(), this.getY())) {
            return 1;
        }
        return 0;
    }

    public void show() {
        System.out.println("==================================");

        System.out.println("Nom : " + this.nom);
        if (this.getDtn() != null) {
            System.out.println("Date de naissance : " + dtn.getJ() + '/' + dtn.getM() + '/' + dtn.getA());
        } else {
            System.out.println("Date de naissance : ??/??/????");
        }

    }

    public void drawPersonne(Graphics g, int scale,int hauteurFenetre) {
        if (this instanceof Patient) {
            g.setColor(Color.RED);
        } else if (this instanceof Docteur) {
            g.setColor(Color.WHITE);
        } else {
            g.setColor(Color.GREEN);
        }

        g.fillOval((int) (getX() * scale), (int)(hauteurFenetre - getY() * scale), 20, 20);
        g.setColor(Color.BLACK);
        g.drawString(getNom(), (int) (getX() * scale), (int) (hauteurFenetre - getY() * scale));
    }

    public void paintMovement(Graphics g, double x, double y, int scale,int hauteurFenetre) {

        double destx = this.getX() + x;
        double desty = this.getY() + y;
        while (Math.abs(this.getX() - destx) > 0.01 || Math.abs(this.getY() - desty) > 0.01) {
            this.deplacer(x / 10, y / 10);
            this.drawPersonne(g, scale, hauteurFenetre);
            
            try {
                Thread.sleep(50);
            } catch (Exception e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }

        this.setPos(destx, desty);
    }

}