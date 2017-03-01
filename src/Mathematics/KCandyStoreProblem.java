package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/k-candy-store/forum
 */

public class KCandyStoreProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int k=0; k < testCase; k++){
            int types = in.nextInt();
            int candies = in.nextInt();

            int n = types + candies - 1;
            int r = candies;



            BigInteger nCk = BigInteger.ONE;
            for (int j = 0; j <= n; j++) {
                System.out.print(nCk.mod(new BigInteger("1000000000")) + " ");
                nCk = nCk.multiply(new BigInteger((n - j)+"")).divide(new BigInteger(((j + 1))+""));
            }
            System.out.println();
        }
        in.close();
    }
}
