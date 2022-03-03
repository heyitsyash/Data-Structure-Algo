package HashSet;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {

    public static void main(String[] args) {

        int arr[] = {5, 10 ,5 ,15, 7,15};
        System.out.println(ans(arr));

    }

    static int ans(int arr[]){

        Set<Integer> set = new HashSet<>();

        for(int x:arr){
            set.add(x);
        }

        return set.size();
    }
}
