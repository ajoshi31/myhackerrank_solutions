package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 13/07/16.
 */
public class SavePrisoner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][3];
        for(int j=0; j < n; j++){
            for(int i=0; i < 3; i++){
                arr[j][i] = in.nextInt();
            }
        }
        for(int j=0; j < n; j++){
            if(arr[j][1]%arr[j][0] == 0){
               if(arr[j][2] == 1){
                   if(arr[j][0] == 1){
                       System.out.println(arr[j][0]);
                   }
                   else {
                       System.out.println(arr[j][1]);
                   }
               }
                else{
                   System.out.println(arr[j][2] - 1);
               }
            }
            else{
                if(arr[j][1]%arr[j][0] + arr[j][2] > arr[j][0] + 1) {
                    System.out.println(arr[j][1] % arr[j][0] + arr[j][2] - arr[j][0] - 1 );
                }
                else{
                    System.out.println(arr[j][1]%arr[j][0] + arr[j][2] -1);
                }
            }
        }
        in.close();
    }
}
