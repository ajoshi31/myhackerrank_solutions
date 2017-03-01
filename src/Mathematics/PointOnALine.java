package Mathematics;

import java.util.*;

/**
 * Created by ajoshi.biz on 03/02/17.
 * https://www.hackerrank.com/challenges/points-on-a-line
 */
public class PointOnALine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        for(int i = 0; i < n; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            al1.add(x);
            al2.add(y);
        }

        System.out.println("Elements of ArrayList of Integer Type X: "+al1);
        System.out.println("Elements of ArrayList of Integer Type Y: "+al2);

        if ((Collections.frequency(al1, al1.get(0))) == al1.size() || (Collections.frequency(al2, al2.get(0))) == al2.size() ){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        in.close();
    }
}


