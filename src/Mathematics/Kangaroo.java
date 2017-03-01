package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 14/07/16.
 */
public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        double M = 0;
        if(x1 == x2 && v1 == v2 ){
            System.out.println("YES");
        }
        else{
            M = (x1-x2)/(v2-v1);
            if(M  > 0){
                if((M-(int)M)!=0)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
