package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/summing-the-n-series?h_r=next-challenge&h_v=zen
 */
public class NthSeries {
    public static void main(String[] args) {
        long MOD=1000000007;
        Scanner in = new Scanner(System.in);
        long inputs = in.nextLong();
        for(int i = 0; i < inputs; i++){
            BigInteger n = in.nextBigInteger();
            System.out.println( n.modPow(BigInteger.valueOf(2), BigInteger.valueOf(MOD)));
        }
        in.close();
    }
}
