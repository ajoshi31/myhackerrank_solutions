package Mathematics; /**
 * Created by atul.joshi on 12/07/16.
 */

import java.io.*;
import java.util.*;


public class ArraySum {
    public static void main(String[] args) {
        long sum = 0;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] arr = new long[n];

        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements is:"+sum);
    }
}
