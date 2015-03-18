package com.jcorn.jcircleparty.client.model;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * jCircleParty
 *
 * @author Markus Petritz
 * @author Julian Maierl
 * @version 1.0.0
 * @see http://petritzdesigns.com
 */
public class Circle {

    private int x, y, radius;
    private Color color;

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 200;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(Color.red);
        g2d.fillOval(x, y, radius, radius);
    }
}
