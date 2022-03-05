package HashSet;

import java.util.HashMap;
//Find the sub Array whose sum is equal to the given sum
public class FindSubArrayGivenSUm {

    public static void main(String[] args) {

        int sum = 5;
        int arr[] = {10,15,-5,15,-10,5};

        subArray(arr,sum);
    }

    //logic - when we subtract the currSum with given sum +1 we get the start index of our sub array
    static void subArray(int arr[], int sum){

        int currSum = 0;
        int start =0;
        int end = -1; //initializing with -1 cause if it doesn't change means we didn't get our sub Array

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i< arr.length;i++){

            currSum += arr[i]; //adding the curr index value to curr sum

            //checking if our sub Array is starting from 0 index
            if((currSum - sum) == 0){
                start=0; end =i;
                break;
            }

            if(map.containsKey(currSum-sum)){ //if the key is already present in the map
                start = map.get(currSum -sum) +1; //start will be curr-sum +1
                end=i;
                break;
            }

            map.put(currSum,i);//if none of the if case implies then just add the curr as key and index as value
        }

        //if end still remains -1
        if (end == -1){
            System.out.println("Not Present");
        }else {
            System.out.println(start + " " +  end);
        }
    }
}
