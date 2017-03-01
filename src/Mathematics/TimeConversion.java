package Mathematics;

import java.util.Scanner;
/**
 * Created by atul.joshi on 13/07/16.
 */
public class TimeConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputStr = in.nextLine();
        String lastTwo = inputStr.substring(inputStr.length() - 2);
        String firstTwo  = inputStr.substring(0, Math.min(inputStr.length(), 2));
        if(lastTwo.equals("AM")){
            if(firstTwo.equals("12")){
                System.out.println("00"+inputStr.substring(2, Math.min(inputStr.length(), inputStr.length() - 2)));
            }
            else{
                System.out.println(inputStr.substring(0, Math.min(inputStr.length(), inputStr.length() - 2)));
            }
        }
        else{
            if(firstTwo.equals("12")){
                System.out.println(inputStr.substring(0, Math.min(inputStr.length(), inputStr.length() - 2)));
            }
            else{
                int ft = Integer.parseInt(firstTwo);
                int finalTime = ft + 12;
                System.out.println(finalTime+inputStr.substring(2, Math.min(inputStr.length(), inputStr.length() - 2)));
            }
        }
    }
}
