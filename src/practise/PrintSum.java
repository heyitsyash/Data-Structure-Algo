package practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sum(arr,n));
    }

    static int sum(int arr[], int n){

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i =0; i<n; i++){
            if(i % 2== 0) even.add(arr[i]);
            else odd.add(arr[i]);
        }

        Collections.sort(even);
        Collections.sort(odd);

        int result = even.get(even.size() - 2) + odd.get(odd.size() -2);

        return result;
    }
}
