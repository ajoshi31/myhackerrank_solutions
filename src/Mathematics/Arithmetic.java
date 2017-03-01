package Mathematics;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        double tipValue = new BigDecimal(mealCost*tipPercent/100).doubleValue();
        System.out.println(tipValue);
        double taxValue = new BigDecimal(mealCost*taxPercent/100).doubleValue();
        System.out.println(taxValue);

        double TotalCost = mealCost + tipValue + taxValue;
        System.out.println(TotalCost);

        int total_Cost = (int) Math.floor(TotalCost);
        if(total_Cost == 1){
            System.out.println("The total meal cost is " + total_Cost + " dollar.");
        }
        else{
            System.out.println("The total meal cost is " + total_Cost + " dollars.");
        }
    }
}

/*
* Learnings :
* The big decimal issue do happen when adding the double
* Important Links : http://stackoverflow.com/questions/179427/how-to-resolve-a-java-rounding-double-issue
* To control the precision of floating point arithmetic, you should use java.math.BigDecimal.
* Read The need for BigDecimal by John Zukowski for more information
* When you are converting from the double value to a BigDecimal,
* you have a choice of using a new BigDecimal(double) constructor or the BigDecimal.valueOf(double) static factory method.
* Use the static factory method.
* */
