package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Fawzan
 * on 7/26/16
 * <fawzanm@gmail.com>
 */
public class Main extends JPanel {

    static Nautilus nautilus=new Nautilus(685,20);   //here is the place which can change the size(height) and the iterations of the nautilus

    private static int WIDTH = (int)(nautilus.getRadius()*(1+1/1.61803398875)+25);
    private static int HEIGHT = nautilus.getRadius()+50;

    private static ArrayList<Shape> listOfShapes;

    public static void main(String[] args) {
        // write your code here

        JFrame frame = new JFrame("Some Shapes");    //frame properties
        frame.setContentPane(new Main());
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setSize(WIDTH, HEIGHT);
        frame.pack();
        frame.setVisible(true);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        nautilus.paintComponent(g);
    }
}
