package com.ddong;
import java.lang.Math;


public class RollLoadedDie {
    public static void main(String[] meow) {
            System.out.println(((int)(Math.random() * 7) + 1) > 6?6:((int)(Math.random() * 4) + 1));
    }
}
