package com.company;

import java.awt.*;
import java.awt.geom.Line2D;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Triangle extends Shape  {

    private int x1, y1, x2, y2,x3,y3;   //feilds:the x and y cordinates of three points

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {   //constructor
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public Triangle(Color color, int x1, int y1, int x2, int y2, int x3, int y3) {   //constructor
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    @Override
    public void draw(Graphics g) {
//        super.draw(g);

        Graphics2D g2 = (Graphics2D) g;   //draw the triangle
        g2.setColor(this.color);

        g2.draw(new Line2D.Double(x1, y1, x2, y2));
        g2.draw(new Line2D.Double(x1, y1, x3, y3));
        g2.draw(new Line2D.Double(x2, y2, x3, y3));

    }

}
