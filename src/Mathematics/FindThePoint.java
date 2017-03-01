package Mathematics;

import java.util.*;

/**
 * Created by ajoshi.biz on 01/02/17.
 * https://www.hackerrank.com/challenges/find-point
 */
public class FindThePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            int px = in.nextInt();
            int py = in.nextInt();
            int qx = in.nextInt();
            int qy = in.nextInt();
            int rx = 2*qx - px;
            int ry = 2*qy - py;
            System.out.print(rx);
            System.out.print(ry);
            System.out.println();
        }
        in.close();
    }
}
