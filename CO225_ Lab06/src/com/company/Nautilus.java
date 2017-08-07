package com.company;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Nautilus extends JPanel {


    //You need to draw the nautilus, what is it? Refer the image img/ folder. Somehow you need to draw it.
    //Here is some help  : http://2muchfun.info/nautilusshell.html

    // what to inherit, what not not to inherit? Well, you need to find the answer for that
    // PS : hue people are engineering students, not some 3rd world programmers

    //If you missed the last workshop don't waste your time, Start learning or start praying

    //We will all be happy if we have more and enough choices, but life is not always fair. So deal with it

    //If you copy, I don't care who you are, I will find you and I will give ZERO marks for both you and the one who gave you the copy

    //-Fawzan, The one who attach people to the truth rather than attaching those people to himself. Yeah, the grammar is correct.

    //Peace out

    private static int radius;    //feilds are radius and iterations.Those properties are taken from the user
    private int iterations;

    public Nautilus(int radius,int iterations) {   //constructor
        this.radius=radius;
        this.iterations=iterations;
    }

    public static int getRadius() {
        return radius;
    }




    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        double golden_ratio=1.61803398875;
        double rad;
        double x1=4.5;    //starting points cordinates x
        double y1=radius+5;   //starting points cordinates y
        double centre_x,centre_y;
        int angle=180;

        int w,h;
        int remainder_4;

        for(int count=1;count<=iterations;count++)
        {
            rad=radius/(Math.pow(golden_ratio,count-1));   //calculating the radius of the current curve

            remainder_4=count%4;
            if(remainder_4==0)     //the same pattern(how the center exist & how the starting and ending points exist) remains after every four curves
            {
                w=-1;
                h=-1;
                centre_x=x1;
                centre_y=y1-rad;
            }
            else if(remainder_4==1)
            {
                w=1;
                h=-1;
                centre_x=x1+rad;
                centre_y=y1;
            }
            else if(remainder_4==2)
            {
                w=1;
                h=1;
                centre_x=x1;
                centre_y=y1+rad;
            }
            else
            {
                w=-1;
                h=1;
                centre_x=x1-rad;
                centre_y=y1;
            }


            /*Square square2=new Square(Color.BLUE,h*rad,w*rad,x1,y1);
            square2.draw(g);*/

            Curves curves=new Curves(Color.red,-90,rad*2,angle,rad*2,centre_x-rad,centre_y-rad);   //draw the curves
            curves.draw(g);

            x1+=w*rad;   //update x1,y1(starting point of next curve)
            y1+=h*rad;
            angle-=90;   //update the starting angle of the next curve
        }
    }
}
