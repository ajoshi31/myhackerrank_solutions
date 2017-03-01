package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/strange-grid
 */
public class StrangeGrid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextInt();
        long y = in.nextInt();
        long value = 0;

        if(x % 2 == 0){
            value = 5*x +2*y - 11;
        }
        else{
            value = 5*x + 2*y - 7;
        }
        System.out.println(value);

        in.close();

    }
}
