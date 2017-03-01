package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/restaurant?h_r=next-challenge&h_v=zen
 */
public class Restaurant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i =0; i < n; i++)
        {
            int hcf=0;
            int n1 = in.nextInt();
            int n2 = in.nextInt();
            int min = Math.min(n1,n2);
            for(int j=min; j >= 1; j--)
            {
                if(n1 % j == 0 && n2 % j == 0)
                {
                    hcf = j;
                    break;
                }
            }
            System.out.println((n1*n2)/(hcf*hcf));
        }
        in.close();
    }
}
