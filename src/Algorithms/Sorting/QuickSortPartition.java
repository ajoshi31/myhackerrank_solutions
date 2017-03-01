package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 07/02/17.
 * https://www.hackerrank.com/challenges/quicksort1
 */
public class QuickSortPartition {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = in.nextInt();
        }

        int pivot = ar[0];

        ArrayList ltp = new ArrayList();
        ArrayList gtp = new ArrayList();
        ArrayList etp = new ArrayList();

        for (int i = 0; i < size; i++) {

            if(ar[i] > pivot){
                gtp.add(ar[i]);
            }
            else if (ar[i] < pivot){
                ltp.add(ar[i]);
            }
            else{
                etp.add(ar[i]);
            }

        }

        List<Integer> combined = new ArrayList<Integer>();
        combined.addAll(ltp);
        combined.addAll(etp);
        combined.addAll(gtp);

        for (Integer temp : combined) {
            System.out.print(temp + " ");
        }

    }
}
