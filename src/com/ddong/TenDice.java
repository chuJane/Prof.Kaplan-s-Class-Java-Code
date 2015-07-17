package com.ddong;

/**
 * Created by ddong on 15/7/16.
 */
public class TenDice {
    public static void main(String[] args){
        //int times = Integer.parseInt(args[0]);
        int times = 1000;
        Integer[] diagram = new Integer[61];
        for (int i = 0;i <= 60;i++) {
            diagram[i] = new Integer(0);
        }
        int sum = 0;
        for (int i = 1;i <= times;i++) {
            sum = 0;
            for (int j = 0; j <= 10;j++){
                sum += (int)(Math.random() * 5 + 1);
            }
            diagram[sum]++;
        }
        for (int i = 10;i <= 60;i++)
        {
            System.out.print(i + " : ");
            for(int j = 1;j <= diagram[i];j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
