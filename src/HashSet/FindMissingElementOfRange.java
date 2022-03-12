package HashSet;

import java.util.HashSet;

//QUES https://www.geeksforgeeks.org/find-missing-elements-of-a-range/
public class FindMissingElementOfRange {

    public static void main(String[] args) {

        int arr[] = {1, 14, 11, 51, 15};

        int low = 50;
        int high = 55;

        findMissing(arr,low,high);
    }

    static void findMissing(int arr[], int low , int high){

        HashSet<Integer> set = new HashSet<>();

        for(int i =0; i<arr.length;i++){
            set.add(arr[i]);
        }

        for (int i =low; i<=high;i++){
            if(!set.contains(i)){
                System.out.print(i + " ");
            }
        }
    }
}
