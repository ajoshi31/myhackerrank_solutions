package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 07/02/17.
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionPart1 {

    private static void insertIntoSorted(int[] ar) {
        // Fill up this function

//        for(int i = 1 ; i < ar.length; i++ ){
//            int x = ar[i];
//            int j= i-1;
//            while (x < ar[j] && j>=0){
//                ar[j+1] = ar[j];
//                j=j-1;
//            }
//            ar[j+1] = x;
//            printArray(ar);
//        }

        for(int j = ar.length-1; j > 0; j--){
            int key = ar[j];
            int i = j-1;
            while(i>=0 && key < ar[i]){
                ar[i+1] = ar[i];
                i = i-1;
                printArray(ar);
            }
            ar[i+1] = key;
        }
        printArray(ar);
    }

    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < s; i++) {
            ar[i] = in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for (int n : ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}


