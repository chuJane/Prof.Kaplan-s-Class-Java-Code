package com.ddong;


/**
 * Created by ddong on 15/7/16.
 */
public class RandomWalker {
        public static void main(String[] args) {
            //int totalStep = Integer.parseInt(args[0]);
            int totalStep = 10;
            int x = 0;int y = 0;int direction;
            for(int i = 1;i <= totalStep;i++){
                direction = (int)(Math.random() * 3 + 1);
                switch (direction)
                {
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
                System.out.println("(" + x + ", " + y + ")");
            }
            System.out.println((x * x + y * y)) ;
        }

}
