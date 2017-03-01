package Algorithms.GraphTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by ajoshi.biz on 07/02/17.
 * https://www.hackerrank.com/challenges/even-tree
 */

public class EvenTree {

    private static HashMap<Integer, ArrayList<Integer>> tree = new HashMap<Integer, ArrayList<Integer>>();
    private static int count;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = scanner.nextInt();
        int e = scanner.nextInt();

        for (int i=1; i<=v; i++) {
            tree.put(i, new ArrayList<Integer>());
        }

        for (int i=0; i<e; i++) {
            int child = scanner.nextInt();
            int parent = scanner.nextInt();
            tree.get(parent).add(child);
        }

        for (int i=2; i<=tree.size(); i++) {
            if ((countChild(i) % 2) != 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static int countChild(int node) {
        int totalChild = tree.get(node).size();
        for (int child : tree.get(node)){
            totalChild += countChild(child);
        }
        return totalChild;
    }
}
