package Mathematics; /**
 * Created by atul.joshi on 13/07/16.
 */
import java.io.*;
import java.util.*;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i=n-1; i >= 0; i--){
            if(i==0)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+" ");

        }
    }

}
