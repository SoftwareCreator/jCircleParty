package com.jcorn.jcircleparty.client.model;

import com.jcorn.jcircleparty.client.helper.SymbolEnum;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.Random;

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
    private final Symbol symbol;

    public Circle(int x, int y, int radius, Color color, Symbol symbol) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.symbol = symbol;
    }

    public Circle() {
        //Get Random Color
        this.x = 0;
        this.y = 0;
        this.radius = 100;
        this.color = Circle.randomColor();
        this.symbol = Circle.randomSymbol();
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
        
        System.out.println(symbol.getType());
        symbol.setSize(radius/3);
        symbol.setPosition(radius - radius/3/2, radius - radius/3/2);
        symbol.draw(g2d);
    }

    public static Color randomColor() {
        Random random = new Random();
        final float hue = random.nextFloat();
        final float saturation = 0.9f;
        final float luminance = 1.0f;
        return Color.getHSBColor(hue, saturation, luminance);
    }
    
    public static Symbol randomSymbol() {
        Random random = new Random();
        return new Symbol(SymbolEnum.values()[random.nextInt(SymbolEnum.values().length)]);
    }
}
