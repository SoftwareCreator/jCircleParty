package com.jcorn.jcircleparty.client.model;

import com.jcorn.jcircleparty.client.helper.SymbolEnum;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @author Jakob Meinhart
 * @version 1.0.0
 * @see http://petritzdesigns.at
 */
public class Symbol {

    private int x, y, size;
    private Color color;
    private final SymbolEnum type;
    private int feldX[] = new int [10];
    private int feldY[] = new int [10];
    private int numberOfPoints = 3;
    private int border = 30;

    public Symbol(SymbolEnum type) {
        this.type = type;
        this.x = 0;
        this.y = 0;
        this.size = 50;
        this.color = Color.white;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public SymbolEnum getType() {
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);

        switch (type) {
            case SQUARE: g2d.fillRect(x, y, size, size);
                         break;
                
            case TRIANGLE: feldX[0] = border;   feldX[1] = size; feldX[2] = size / 2;
                           feldY[0] = size; feldY[1] = size; feldY[2] = border;
                           g2d.fillPolygon(feldX, feldY, numberOfPoints);
                           break;
                
            case HIPSTER_TRIANGLE: feldX[0] = border; feldX[1] = size; feldX[2] = size / 2;
                                   feldY[0] = border; feldY[1] = border;   feldY[2] = size;
                                   g2d.fillPolygon(feldX, feldY, numberOfPoints);
                                   break;

            case OVAL: g2d.fillOval(x + border, y + border, size - 100, size);
                       break;
                
            case RECTANGLE: g2d.fillRect(x + border, y + border, size, size - 100);
                            break;
                
            case HEXAGON: feldX[0] = border;   feldX[1] = size / 4; feldX[2] = (size / 4) * 3; feldX[3] = size - border; feldX[4] = (size / 4) * 3; feldX[5] = size / 4;
                          feldY[0] = size / 2; feldY[1] = border;   feldY[2] = border;         feldY[3] = size / 2;      feldY[4] = size - border;  feldY[5] = size - border;
                          numberOfPoints = 6;
                          g2d.fillPolygon(feldX, feldY, numberOfPoints);
                          break;
                
            case DIAMOND: feldX[0] = size / 2; feldX[1] = (size / 4) * 3; feldX[2] = size / 2;      feldX[3] = border;
                          feldY[0] = border;   feldY[1] = size / 2;       feldY[2] = size - border; feldY[3] = size / 2;     
                          numberOfPoints = 4;
                          g2d.fillPolygon(feldX, feldY, numberOfPoints);
                          break;
                
            case CIRCLE: g2d.fillOval(x + border, y + border, size - border, size - border);
                         break;
            default: g2d.fillOval(x + border, y + border, size - border, size - border);
                     break;
        }
    }
}
