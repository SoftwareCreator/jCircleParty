package com.jcorn.jcircleparty.client.model;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * jCircleParty
 * 
 * @author Markus Petritz
 * @version 1.0.0
 * @see http://petritzdesigns.com
 */
public class Circle {
    
    public void draw(int x, int y, int size, Graphics2D g2d) {
        g2d.setColor(Color.red);
        g2d.drawOval(x, y, size, size);
    }
}
