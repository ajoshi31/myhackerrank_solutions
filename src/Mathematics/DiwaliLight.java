package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.pow;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/diwali-lights?h_r=next-challenge&h_v=zen
 */
public class DiwaliLight {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long testCases = in.nextInt();
        BigInteger m = BigInteger.valueOf(100000);
        for(long i = 0; i< testCases; i++){
            BigInteger bulbs = in.nextBigInteger();
            System.out.println(BigInteger.valueOf(2).modPow(bulbs, m).subtract(BigInteger.ONE));
        }
    }
}
