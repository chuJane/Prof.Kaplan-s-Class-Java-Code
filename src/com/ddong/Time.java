package com.ddong;


public class Time {
    static int Hour; static boolean isPM;
    public static void main(String[] args) {
        Hour = 12; isPM = true;
        int totalMinute = Integer.parseInt(args[0]);
        //int totalMinute = 725;
        int remain = parseTime(totalMinute);
        System.out.print(Hour);
        System.out.print(" : ");
        System.out.print(remain >= 10 ? remain : "0" + remain);
        System.out.print(isPM ? " PM" : " AM");
    }
    private static int parseTime(int minuteRemaining){
        if (minuteRemaining >= 60) {
            Hour++;
            if (Hour > 12){
                Hour = 1;
                isPM = !isPM;
            }
            minuteRemaining -= 60;
            return parseTime(minuteRemaining);
        }
        else{
            return minuteRemaining;
        }
    }
}
