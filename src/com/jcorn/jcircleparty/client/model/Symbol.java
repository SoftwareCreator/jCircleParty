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
            case SQUARE:
                g2d.fillRect(x, y, size, size);
                break;
            case TRIANGLE:
                break;
            case HIPSTER_TRIANGLE:
                break;
            case OVAL:
                g2d.fillOval(x + 30, y, size - 100, size);
                break;
            case RECTANGLE:
                g2d.fillRect(x, y + 10, size, size - 20);
                break;
            case HEXAGON:
                break;
            case DIAMOND:
                break;
            case CIRCLE:
            default:
                g2d.fillOval(x, y, size, size);
                break;
        }
    }
}
