package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 07/02/17.
 * https://www.hackerrank.com/challenges/insertionsort1
 */
public class InsertionPart2 {

    private static void insertIntoSorted(int[] ar) {
        for(int i = 1 ; i < ar.length; i++ ){
            int x = ar[i];
            int j = i;
            while (j>0 && x < ar[j-1]){
                ar[j] = ar[j-1];
                j=j-1;
            }
            ar[j] = x;
            printArray(ar);
        }
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


