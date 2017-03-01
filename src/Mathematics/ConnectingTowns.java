package Mathematics;

import java.util.Scanner;
import java.util.*;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/connecting-towns
 */
public class ConnectingTowns {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            int towns = in.nextInt();
            int nthRoute = 1;
            for(int j = 0; j < towns-1; j++){
                int routes = in.nextInt();
                nthRoute = nthRoute * routes;
            }
            System.out.println(nthRoute);
        }
        in.close();
    }
}
