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
    private final Color color;

    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public Circle() {
        this.radius = 200;
        this.color = Color.red;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval(x, y, radius, radius);
    }
}
