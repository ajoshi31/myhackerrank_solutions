package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 07/02/17.
 * https://www.hackerrank.com/challenges/quicksort1
 */

public class QuickSort2 {

    public static void quickSort( int[] ar, int min_pos, int max_pos ){

        if(min_pos >= max_pos){
            return;
        }
        int pivotPos = pivotPosition(ar,min_pos,max_pos);
        quickSort(ar,min_pos,pivotPos - 1 );
        quickSort(ar,pivotPos + 1,max_pos);
        printArray(ar,min_pos, max_pos);
    }

    public static int pivotPosition(int[] ar, int minpos, int maxpos ){

        int p = ar[minpos];
        ArrayList<Integer> leftlist = new ArrayList<Integer>();
        ArrayList<Integer> rightlist = new ArrayList<Integer>();

        for(int i = minpos+1 ; i <= maxpos; i++)
        {
            if(ar[i] > p)
                rightlist.add(ar[i]);
            else
                leftlist.add(ar[i]);
        }
        copy(leftlist,ar,minpos);
        int ppos = leftlist.size()+minpos;
        ar[ppos] = p;
        copy(rightlist,ar,ppos+1);

        return minpos + leftlist.size();
    }

    static void copy(ArrayList<Integer> list, int ar[], int startIdx)
    {
        for(int num : list)
        {
            ar[startIdx++] = num;
        }
    }

    static void printArray(int[] ar,int start, int end) {
        for(int i = start; i <= end;i++)
            System.out.print(ar[i]+" ");
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < size; i++) {
            ar[i] = in.nextInt();
        }
        int min = 0;
        int max = ar.length-1;
        quickSort(ar,min,max);
    }
}
