package Mathematics;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/most-distant
 */
public class MostDistant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int smallestX = Integer.MAX_VALUE;
        int largestX = Integer.MIN_VALUE;
        int smallestY = Integer.MAX_VALUE;
        int largestY = Integer.MIN_VALUE;
        int testCase = in.nextInt();
        int disX = 0;
        int disY = 0;
        double disXmaxYmax = 0;
        double disXmaxYmin = 0;
        double disXminYmax = 0;
        double disXminYmin = 0;

        for (int i = 0; i<testCase; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            if (x < smallestX)
            {
                smallestX = x;
            }
            if(x > largestX){
                largestX = x;
            }
            if (y < smallestY)
            {
                smallestY = y;
            }
            if(y > largestY){
                largestY = y;
            }

            disX =  abs(largestX - smallestX);
            disY =  abs(largestY - smallestY);

        }

        System.out.println(disX);
        System.out.println(disY);
        in.close();
    }
}
