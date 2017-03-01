package Mathematics;

import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/harry-potter-and-the-floating-rocks
 */
public class FloatingRock {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i<testCase; i++){
            int x1 = in.nextInt();
            int y1 = in.nextInt();
            int x2 = in.nextInt();
            int y2 = in.nextInt();
            int yDiff = y2 - y1;
            int xDiff = x2 - x1;
            int gcd = gcd(yDiff,xDiff);
            System.out.println( abs(gcd) - 1);
        }
        in.close();
    }

    public static int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
}
