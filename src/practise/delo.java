package practise;

import java.util.*;

public class delo {

    public static void main(String[] args) {

        int arr[] = {15,16,19,22,45,75};

        stabilizedTrayWeight(arr,6);
    }

    public static void stabilizedTrayWeight(int arr[],int N){


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i : arr){
            map.put(i,map.getOrDefault(i,0) + 1);
        }

        for(int i : arr){
            System.out.print((N - map.get(i)) + " ");
        }

    }
}
