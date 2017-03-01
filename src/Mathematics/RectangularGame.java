package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/rectangular-game
 */
public class RectangularGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long smallestRow = Integer.MAX_VALUE;
        long smallestCol = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            long col = in.nextInt();
            long row = in.nextInt();

            if(col < smallestCol ){
                smallestCol = col;
            }
            if(row < smallestRow){
                smallestRow = row;
            }
        }

        System.out.println(smallestCol*smallestRow);
        in.close();
    }
}
