package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 13/07/16.
 */
public class StairCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            for(int j=0; j < N-i-1; j++){
               System.out.print(" ");
            }
            for(int j=N-i-1; j < N; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        in.close();
    }
}
