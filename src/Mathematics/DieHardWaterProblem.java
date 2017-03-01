package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/die-hard-3
 */
public class DieHardWaterProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i = 0; i < testCase; i++){

            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();

            int gcd = gcd(a,b);
            int max = Math.max(a,b);
            if(c > max){
                System.out.println("NO");
                continue;
            }
            if(c==a || c==b || c%gcd == 0){
                System.out.println("YES");
                continue;
            }
            System.out.println("NO");
        }
        in.close();
    }
    public static int gcd(int x, int y){
        return (y == 0) ? x : gcd(y, x % y);
    }
}
