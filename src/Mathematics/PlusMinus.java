package Mathematics;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by atul.joshi on 13/07/16.
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] arr = new int[N];
        int pos = 0 , neg = 0, zero = 0;
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
            if (arr[i] > 0){
                pos++;
            }
            else if (arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }


        //System.out.println(pos/N);
        DecimalFormat f = new DecimalFormat("##.000000");
        String posFraction = f.format((double)pos/(double)N);
        String negFraction = f.format((double)neg/(double)N);
        String zeroFraction = f.format((double)zero/(double)N);

        System.out.println(posFraction);
        System.out.println(negFraction);
        System.out.println(zeroFraction);

        in.close();
    }
}
