package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 01/02/17.
 * https://www.hackerrank.com/challenges/maximum-draws
 */
public class MaximumDraw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            int pair = in.nextInt();
            System.out.println(pair + 1);
        }
        in.close();
    }
}
