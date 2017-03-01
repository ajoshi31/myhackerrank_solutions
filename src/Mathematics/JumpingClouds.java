package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 15/07/16.
 */
public class JumpingClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count = 0;
        int jump = 0;
        int j = 1;
        if(c[j-1] == 1){
            count++;
        }
        if(j+k > n){
            j=j+k-n;
        } else {
            j=j+k;
        }
        while( j != 1){
            if(c[j-1] == 1){
                count++;
            }
            if(j+k > n){
              j=j+k-n;
            } else {
              j=j+k;
            }
            jump++;
        }
        System.out.println(100 - (count*2)-jump -1);
    }
}
