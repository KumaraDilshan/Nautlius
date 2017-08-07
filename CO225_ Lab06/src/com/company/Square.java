package com.company;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Square extends Shape {

    private double x, y;
    private double width, height;

    public Square(double height, double width, double x, double y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public Square(Color color, double height, double width, double x, double y) {
        super(color);
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {

//        super.draw(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.draw(new Line2D.Double(x, y, x + width, y));
        g2.draw(new Line2D.Double(width + x, y, x + width, y + height));
        g2.draw(new Line2D.Double(x, y + height, x + width, y + height));
        g2.draw(new Line2D.Double(x, y, x, y + height));

    }
}
