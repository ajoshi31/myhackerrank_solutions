package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/reverse-game
 */
public class ReverseGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        for(int i =0; i < testCase; i++)
        {
            int position = 0;
            int n = in.nextInt();
            int toFind = in.nextInt();

            int midVal = n/2;

            if(toFind < midVal){
                 position = 2*toFind +1;
            }
            else{
                position = 2*(n - toFind) - 2;
            }
            System.out.println(position);
        }
        in.close();
    }
}
