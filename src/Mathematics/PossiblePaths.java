package Mathematics;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/possible-path
 */
public class PossiblePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for (int i = 0; i<testCase; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int gcd1 = gcd(a,b);
            int gcd2 = gcd(x,y);
            if(gcd1 == gcd2){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }

    public static int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
}
