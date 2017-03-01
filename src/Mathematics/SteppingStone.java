package Mathematics;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/stepping-stones-game
 * Apply SriDharacharya Rule
 */
public class SteppingStone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        double d;
        while(testCase-- > 0) {

            long N = in.nextLong();
            d = sqrt(1 + 8 * N);
            //check if d is perfect square
            if((d - (int) d) == 0)
                System.out.println("Go On Bob " + (int)(d - 1)/2);
            else
                System.out.println("Better Luck Next Time");
        }
    }
}
