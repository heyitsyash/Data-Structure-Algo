package HashSet;

import java.util.HashSet;
import java.util.Set;

public class FindIntersection {
    public static void main(String[] args) {

        //intersection is common elements in both arr
        int arr[] = {5, 10, 15,5};
        int arrb[] = {10,4};


        System.out.println(intersection(arr,arrb));
    }

    static int intersection(int arr[],int arrb[]){
        Set<Integer> set  = new HashSet<>();
        for (int a:arr) {
            set.add(a);
        }

        int count=0;
        for (int a:arrb) {
            if (set.contains(a))
                count++;
            set.remove(a);//so that it should not count again
        }

        return set.size();
    }
}
