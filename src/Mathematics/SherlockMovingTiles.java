package Mathematics;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

/**
 * Created by ajoshi.biz on 02/02/17.
 * https://www.hackerrank.com/challenges/sherlock-and-moving-tiles
 */
public class SherlockMovingTiles {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int sideOfTile = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();
        int relative_Velocity = abs(v1-v2);
        int queries = in.nextInt();
        for(int i = 0; i < queries; i++){
            double areaSmall = in.nextDouble();
            double time = abs(sqrt(2) * (sideOfTile - sqrt(areaSmall))) / (double)(relative_Velocity) ;
            System.out.println(time);
        }
        in.close();
    }
}
