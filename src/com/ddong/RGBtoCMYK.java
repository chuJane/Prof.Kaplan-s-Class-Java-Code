package com.ddong;

public class RGBtoCMYK {

    public static void main(String[] args) {
        int red,blue,green;
        double cyan,magenta,yellow,black,dred,dblue,dgreen,white;
        red = Integer.parseInt(args[0]);
        blue = Integer.parseInt(args[0]);
        green = Integer.parseInt(args[0]);
        dred = (double)red;
        dblue = (double)blue;
        dgreen = (double)green;
        white = Math.max(Math.max(dred / 255, dgreen / 255),Math.max(dgreen / 255, dblue / 255));
        cyan =  (white - dred / 255) / white;
        magenta =  (white - dgreen / 255) / white;
        yellow =  (white - dblue / 255) / white;
        black = 1 - white;
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);
        System.out.println("cyan = " + cyan);
        System.out.println("magenta = " + magenta);
        System.out.println("yellow = " + yellow);
        System.out.println("black = " + black);

    }

}
