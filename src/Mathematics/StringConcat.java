package Mathematics; /**
 * Created by atul.joshi on 12/07/16.
 */
import java.io.*;
import java.util.*;

public class StringConcat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String testString = sc.next();
            //System.out.println(testString);
            char[] myCharArray = testString.toCharArray();
            for(int j = 0; j < testString.length(); j++){
                // Print each sequential character on the same line
                if(j%2==0){
                    System.out.print(myCharArray[j]);
                }
            }
            System.out.print(" ");
            for(int j = 0; j < testString.length(); j++){
                // Print each sequential character on the same line
                if(j%2==1){
                    System.out.print(myCharArray[j]);
                }

            }
            System.out.println();
        }
        sc.close();
    }
}


/*
Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        for(int i = 0; i < testCases; i++){
            char[] inputString = scan.next().toCharArray();
            StringBuilder oddString = new StringBuilder();
            StringBuilder evenString = new StringBuilder();

            for(int j = 0; j < inputString.length; j++) {
                if( (j & 1) == 0) {
                    evenString.append(inputString[j]);
                }
                else {
                    oddString.append(inputString[j]);
                }
            }

            System.out.println(evenString + " " + oddString);
        }
        scan.close();
*/

/*
* char[] myCharArray = testString.toCharArray();
* String Builder Function:
*  http://javarevisited.blogspot.in/2011/07/string-vs-stringbuffer-vs-stringbuilder.html
*
* */
