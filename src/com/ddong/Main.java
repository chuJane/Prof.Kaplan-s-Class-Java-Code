package com.ddong;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        String[] meow = new String[5];
        for (int i = 1;i <= 4;i++) {
            meow[i] = mysc.next();

        }
        int totalq1 = Integer.parseInt(meow[1]);
        int answerq1 = Integer.parseInt(meow[2]);

        int totalq2 = Integer.parseInt(meow[3]);
        int answerq2 = Integer.parseInt(meow[4]);

        double percentage = (double)(answerq1 + answerq2) / (double)(totalq1 + totalq2);
        percentage *= 100;
        System.out.println(percentage);
    }
}
