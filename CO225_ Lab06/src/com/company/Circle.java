package com.company;

import java.awt.*;
import java.awt.geom.Ellipse2D;


/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Circle extends Shape {
    private int x, y;   //the cordinates of the center and the radius are the feilds
    private int radius;

    public Circle(int y, int x, int radius) {   //contructors
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    public Circle(Color color, int y, int x, int radius) {  //contructors
        super(color);
        this.y = y;
        this.x = x;
        this.radius = radius;
    }

    @Override
    public void draw(Graphics g) {  //draw the circle
//        super.draw(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.draw(new Ellipse2D.Double(radius,2*radius,x,y));
    }

}
