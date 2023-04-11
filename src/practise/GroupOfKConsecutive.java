package practise;

import java.util.HashMap;

public class GroupOfKConsecutive {

    public static void main(String[] args) {

        int arr[] = {1,2,7,7,4,3,6};

        System.out.println(findMaxSum(arr,3));
    }

    static int  findMaxSum(int arr[] , int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        int j =0,i =0, sum =0 , maxSum =0;

        while(j < arr.length){

            int num = arr[j];
            sum += num;
            map.put(num,map.getOrDefault(num,0) + 1);
            if(map.get(num) > 1){
                sum =0;
                map.put(arr[i],map.get(arr[i]) - 1);
                map.put(arr[i+k],map.getOrDefault(arr[i+k],0) +1);
                i = i+k;
                j = i;
            }


            if(j -i + 1 < k){

                j++;
            }

            else{
                System.out.println(sum);
                maxSum = Math.max(sum,maxSum);
                map.put(arr[i],map.get(arr[i]) - 1);
                sum -= arr[i];
                i++; j++;
            }
        }

        return maxSum;
    }
}
