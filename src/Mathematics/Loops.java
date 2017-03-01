package Mathematics;

import java.io.*;
import java.util.*;

public class Loops {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int multipleOf = scan.nextInt();
        for (int i = 1; i<=10; i++){
                int out = i *  multipleOf;
                System.out.println( multipleOf + " x " + i + " = " + out);
        }

    }
}