
package location;

import aff.Dessin;
import javax.swing.*;
import java.awt.*;

public class Chambre {
    protected int numero;
    protected Rectangle dimension;

    public Chambre(int numero, int x, int y, int width, int height) {
        this.numero = numero;
        this.dimension = new Rectangle(x, y, width, height);
    }

    public void setDimension(int x, int y, int width, int height) {
        this.dimension = new Rectangle(x, y, width, height);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public Rectangle getDimension() {
        return dimension;
    }

    public boolean contient(double x, double y) {
        double x0 = getDimension().getX();
        double y0 = getDimension().getY();
        if (x >= x0 && y >= y0 && x <= x0 + getDimension().getWidth() && y <= y0 + getDimension().getHeight()) {
            return true;
        }
        return false;
    }

    public void dessiner(Graphics g, int scale,int hauteurFenetre) {

        int x = (int)(getDimension().getX()*scale);
        int y = (int)(getDimension().getY()*scale);
        
        int height = (int)(getDimension().getHeight()*scale);
        int width = (int)(getDimension().getWidth()*scale);
        y = (int)(hauteurFenetre -(y+height));

        g.setColor(Color.GRAY);

        g.fillRect( x ,  y ,  width ,height );
        g.setColor(Color.RED);
        g.drawRect( x ,  y,  width ,  height );
        g.drawString("Chambre " + getNumero(),  (x  + width  / 2),
                 (y  + height * scale / 2));

    }
}
