package HashSet;

import java.util.HashSet;
import java.util.Set;

public class findUnion {

    public static void main(String[] args) {

        //union is total distinct elements of two arr
        int arr[] = {5, 10, 15,5};
        int arrb[] = {10,4};

        System.out.println(union(arr,arrb));
    }

    static int union(int arr[],int arrb[]){
        Set<Integer> set  = new HashSet<>();
        for (int a:arr) {
            set.add(a);
        }

        for (int a:arrb) {
            set.add(a);
        }

        return set.size();
    }
}
