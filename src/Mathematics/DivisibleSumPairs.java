package Mathematics;

import java.util.*;

/**
 * Created by atul.joshi on 14/07/16.
 */

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String x1 = in.nextLine();
        String[] splitArray = x1.split("\\s+");

        int N = Integer.parseInt(splitArray[0]);
        int[] arr = new int[N];

        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }

        int k = Integer.parseInt(splitArray[1]);

        HashMap<Integer,Integer> hm = new HashMap();
        for(int i=0; i < N; i++){
            int temp = arr[i] % k;
            if(hm.containsKey(temp)){
                int value = hm.get(temp);
                value++;
                hm.put(temp,value);
            }else{
                hm.put(temp,1);
            }
        }

        int pairs = 0;
        if(hm.containsKey(0)){
            int sizeAtZero = hm.get(0);
            pairs = (int) factorial(sizeAtZero)/(int) (factorial(2)*factorial(sizeAtZero - 2));
        }

        if(k%2 == 0){
            if(hm.containsKey(k/2)){
                int sizeAtMid = hm.get(k/2);
                pairs = pairs + (int) factorial(sizeAtMid)/(int) (factorial(2)*factorial(sizeAtMid - 2));
            }
        }

        for(int j=1; j<(k+1)/2; j++ ){
            if(hm.containsKey(j) && hm.containsKey(k-j)){
                pairs = pairs + (hm.get(j)*hm.get(k-j));
            }
        }

        System.out.println(pairs);

//        for(int i=0; i < N; i++){
//            int temp = arr[i] % k;
//            if(hm.containsKey(temp)){
//                List<Integer> integers = hm.get(temp);
//                integers.add(arr[i]);
//                hm.put(temp,integers);
//            }else{
//                List<Integer> mylist = new ArrayList<Integer>();
//                mylist.add(arr[i]);
//                hm.put(temp,mylist);
//            }
//        }
//
//        if(hm.containsKey(0)){
//            List<Integer> ListAtZero =  hm.get(0);
//            int sizeAtZero = ListAtZero.size();
//        }
//        int hasMapSize = hm.size();
//        if(k%2 ==0){
//            if(hm.containsKey(k/2)){
//                List<Integer> ListAtMid =  hm.get(0);
//                int sizeAtMid = ListAtMid.size();
//            }
//        }

//        Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
//        Iterator i = entries.iterator();
//        while(i.hasNext()) {
//            Map.Entry me = (Map.Entry)i.next();
//            System.out.print(me.getKey() + ": ");
//            System.out.println(me.getValue());
//        }
    }

    public static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException(n + " is out of range");
        return (1 > n) ? 1 : n * factorial(n - 1);
    }
}

/*
* Has Map Study : ArrayList will not work as the key are getting generated randomly and array list increase sequentially
* 12 6
* 1 2 2 2 2 2 2 2 2 2 2 3
*/