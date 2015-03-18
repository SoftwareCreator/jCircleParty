package com.jcorn.jcircleparty.client.model;

import com.jcorn.jcircleparty.client.helper.SymbolEnum;
import java.awt.Color;
import java.awt.Graphics2D;

/**
 * jCircleParty
 *
 * @author Markus Petritz
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

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        
        switch (type) {
            case RECTANGLE:
                break;
            case TRIANGLE:
                break;
            case CIRCLE:
                break;
            default:
                g2d.fillOval(x, y, size, size);
                break;
        }
    }
}
