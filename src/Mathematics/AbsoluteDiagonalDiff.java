package Mathematics;

import java.util.*;
/**
 * Created by atul.joshi on 13/07/16.
 */
public class AbsoluteDiagonalDiff {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int rowDiff = 0;
        int[][] arr = new int[N][N];
        for (int i = 0; i < N; i++) {
            for(int j=0; j < N; j++){
                arr[i][j] = in.nextInt();
            }
            rowDiff = rowDiff + arr[i][i] - arr[i][N-i-1];
        }
        System.out.println(Math.abs(rowDiff));
        in.close();
    }
}
