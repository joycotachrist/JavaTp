
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

    public void dessiner(Graphics g, int scale) {

        double x = getDimension().getX();
        double y = getDimension().getY();
        // int ymax = 400;
        double height = getDimension().getHeight();
        double width = getDimension().getWidth();
        // y = ymax-y*scale-height;

        g.setColor(Color.GRAY);

        g.fillRect((int) x * scale, (int) y*scale , (int) width * scale, (int) height * scale);
        g.setColor(Color.RED);
        g.drawRect((int) x * scale, (int) y*scale, (int) width * scale, (int) height * scale);
        g.drawString("Chambre " + getNumero(), (int) (x * scale + width * scale / 2),
                (int) (y * scale + height * scale / 2));

    }
}
