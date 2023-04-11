package Array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegative {

    public static void main(String[] args) {

        int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};

        int res[] = negative(arr,arr.length,3);

        //System.out.println(res.length);
        for(int i : res){
            System.out.print(i + " ");
        }
    }

     public static int[] negative(int arr[], int n, int k){

        List<Integer> list = new ArrayList<>();

        Queue<Integer> q = new LinkedList<>();

        int i =0, j =0;

        while(j < n){

            if(arr[j] < 0)q.add(arr[j]);

            if(j - i + 1 < k) j++;

            else{

                if(q.isEmpty()){
                    list.add(0);
                    //System.out.print(0 + " ");
                }

                else{
                    list.add(q.peek());
                    //System.out.print(q.peek() + " ");
                    if(q.contains(arr[i])) q.remove(arr[i]);
                }

                i++;j++;
            }
        }

        int a[] = new int[list.size()];

        for(int l =0 ; l< a.length; l++){
            a[l] = list.get(l);
        }

        return a;
    }
}
