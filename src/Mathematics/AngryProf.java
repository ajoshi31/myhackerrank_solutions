package Mathematics;

import java.util.Scanner;

/**
 * Created by atul.joshi on 14/07/16.
 */
public class AngryProf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int k=0; k < T; k++){
            int students  = in.nextInt();
            int threshhold  = in.nextInt();
            int count = 0;
            int[] studentArr = new int[students];
            for(int j=0; j < students; j++){
                studentArr[j] = in.nextInt();
                if(studentArr[j] <= 0){
                    count++;
                }
            }
            if(threshhold <= count){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
        in.close();
    }
}
