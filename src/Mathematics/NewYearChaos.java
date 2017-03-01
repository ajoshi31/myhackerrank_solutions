package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 13/07/16.
 */
public class NewYearChaos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int k=0; k < T; k++){
            int N  = in.nextInt();
            int[] arr = new int[N];
            for(int j=0; j < N; j++){
                arr[j] = in.nextInt();
            }
            int count = 0;
            boolean flag = false;
            for(int i=0; i < N; i++){
                int count2 = 0;
                if((arr[i] - i ) > 3){
                    System.out.println("Too chaotic");
                    flag = true;
                    break;
                }
                for(int j=i+1; j< N; j++){
                    if( arr[i] > arr[j]){
                        count = count + 1;
                        count2 = count2 +1;
                        if(count2 == 2){
                            break;
                        }
                    }
                }
            }
            if(flag == false){
                System.out.println(count % (int)Math.pow(10,5));
            }
        }
        in.close();
    }
}
