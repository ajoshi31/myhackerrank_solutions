package Mathematics;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by atul.joshi on 12/07/16.
 */

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String testVal = sc.nextLine();
        int length = String.valueOf(testVal).length();
        BigInteger multiplyingFactor = new BigInteger("1");
        BigInteger sum  = new BigInteger("0");
        for (int i = length; i > 0; i--){
            char result = testVal.charAt(i-1);
            sum = sum.add(multiplyingFactor.multiply(new BigInteger(((result-'0')*i)+"")));
            multiplyingFactor =   multiplyingFactor.multiply(new BigInteger(10+"")).add(new BigInteger("1")).mod(new BigInteger((((int)Math.pow(10,9)+7))+""));
        }
        BigInteger sumVal =  sum.mod(new BigInteger((((int)Math.pow(10,9)+7))+""));  //(int) (%()) ;
        System.out.println(sumVal);
    }
}
