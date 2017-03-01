package Mathematics;

import java.util.Scanner;

/**
 * Created by ajoshi.biz on 01/02/17.
 * https://www.hackerrank.com/challenges/handshake
 */
public class HandShakes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            int people = in.nextInt();
            System.out.println(people * (people -1)/2 );
        }
        in.close();
    }
}
