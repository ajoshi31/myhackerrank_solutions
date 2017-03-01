package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/triangle-numbers
 */
public class TriangleNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
        int ans = 0;
        for (int i = 0; i<testCase; i++){
            int rowNum = in.nextInt();

            if(rowNum == 1 || rowNum == 2){
                ans = 0;
            }
            else if(rowNum % 2 == 1){
                ans = 2;
            }
            else{
                if(rowNum % 4 == 0){
                    ans = 3;
                }
                else{
                    ans = 4;
                }
            }
            System.out.println(ans);
        }
        in.close();
    }
}
