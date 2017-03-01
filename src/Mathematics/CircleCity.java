package Mathematics;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/circle-city
 */
public class CircleCity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i =0; i < testCase; i++)
        {
            int radiusSquare = in.nextInt();
            int policeStations = in.nextInt();
            int x = 0;
            int count  = 0;
            while(radiusSquare > x*x){
                int ySquare = radiusSquare - x * x;
                int y = (int)sqrt(ySquare);
                if(ySquare == y*y){
                    count++;
                }
                x++;
            }
            if(policeStations >= 4*count){
                System.out.println("possible");
            }
            else {
                System.out.println("impossible");
            }
        }
        in.close();
    }
}
