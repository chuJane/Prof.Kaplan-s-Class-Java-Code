package com.ddong;

public class GreatCircle {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        x1 = Math.toRadians(Double.parseDouble(args[0]));
        x2 = Math.toRadians(Double.parseDouble(args[1]));
        y1 = Math.toRadians(Double.parseDouble(args[2]));
        y2 = Math.toRadians(Double.parseDouble(args[3]));
        double result = 60 * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
        System.out.println(result);

    }
    public static double myMax(Double[] numbers) {
        double tmp = numbers[0];
        for (int i = 1;i <= numbers.length;i++){
            if (numbers[i] > tmp){
                tmp = numbers[i];
            }
        }
        return tmp;
    }
}
