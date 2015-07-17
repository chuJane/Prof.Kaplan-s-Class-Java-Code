package com.ddong;


/**
 * Created by ddong on 15/7/16.
 */
public class RandomWalkers {
        public static void main(String[] args) {
            //int totalStep = Integer.parseInt(args[0]);
            //int totalWalkers = Integer.parseInt(args[1]);
            int totalStep = 10;
            int totalWalkers = 3;
            double totalSquareDistance = 0;
            int x;int y;int direction;
            for (int j = 1;j <= totalWalkers;j++) {
                x = 0; y = 0;direction = 0;
                for (int i = 1; i <= totalStep; i++) {
                    direction = (int) (Math.random() * 3 + 1);
                    switch (direction) {
                        case 1:
                            x++;
                            break;
                        case 2:
                            x--;
                            break;
                        case 3:
                            y++;
                            break;
                        case 4:
                            y--;
                            break;
                        default:
                            break;
                    }
                    totalSquareDistance += (x * x + y * y);
                }
            }
            System.out.println("mean square distance = " + totalSquareDistance / totalWalkers);
        }

}
