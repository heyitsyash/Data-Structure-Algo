package leetcode;

import java.util.HashMap;

public class KthLargestELment {

    public static void main(String[] args) {

        int arr[] = {2,7,11,15};

        System.out.println(kthLargest(arr, arr.length, 9));




    }

    public static int[] kthLargest(int nums[], int n,int target){


        //brut force
//        int result[] = new int[2];
//        for (int  i =0; i<n-1; i++){
//            for (int j = i+1; j<n; j++){
//                if (arr[i] + arr[j] == target){
//                    result[0] = i;
//                    result[1] =j;
//                }
//            }
//        }
        //return result;



        //using Hashmap
        HashMap<Integer,Integer> map = new HashMap();

        for(int i =0; i<n; i++){
            map.put(nums[i],i);
        }


        for(int i =0; i<n; i++){
            int num = nums[i];
            int rem = target - num;
            if(map.containsKey(rem)){
                int index = map.get(rem);
                if(index == i)continue;
                return new int[]{i,index};
            }
        }

        return new int[]{};
    }
}
