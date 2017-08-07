package com.company;

/**
 * Created by Gerrie on 7/30/2016.
 */

//class for drawing curves

import java.awt.*;

public class Curves extends Shape {
    private double x, y;
    private double width,length;
    private int startangle,arcangle;

    public Curves(int arcangle, double length, int startangle, double width, double x, double y) {
        this.arcangle = arcangle;
        this.length = length;
        this.startangle = startangle;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public Curves(Color color, int arcangle, double length, int startangle, double width, double x, double y) {
        super(color);
        this.arcangle = arcangle;
        this.length = length;
        this.startangle = startangle;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(Graphics g) {
//        super.draw(g);

        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(this.color);

        g2.drawArc((int)x,(int)y,(int)width,(int)length,startangle,arcangle);
    }
}
