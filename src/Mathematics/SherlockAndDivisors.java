package Mathematics;

import java.util.Scanner;
import static java.lang.Math.sqrt;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/sherlock-and-divisors
 */

public class SherlockAndDivisors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long testCases = in.nextInt();
        for(long j = 0; j< testCases; j++){
            int n = in.nextInt();
            //find all divisors of n
            int count = 0;
            for (int i=1; i<=sqrt(n); i++)
            {
                if (n%i==0)
                {
                    if (n/i == i) {
                        if(i%2 == 0){
                            count++;
                        }
                    }
                    else {
                        if(i%2 == 0){
                            count++;
                        }
                        if((n/i)%2 == 0){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
    }
}
