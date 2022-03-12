package HashSet;

import java.util.HashMap;

//Count Distinct Element in every window of size k
public class CountDistinctElementInWindow {

    public static void main(String[] args) {


        int arr[] = {1,2,2,1,3,1,1,3};

        count(arr,4);
    }

    //the ques is we have to count the distinct element in every k elements row in na array
    //so, first we'll check for the first k elements and put the elements and its freq if it repeats then increase the freq
    //then check from the kth element first we'll remove the last element add if its freq is 1 then just remove from map if not then decrease its freq
    //then put the next kth element frm arr in map if it is already present then increase if not then default(0) +1
    static void count(int arr[], int k){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++){ //putting first k elements


            map.put(arr[i],map.getOrDefault(arr[i],0)+1); //getordefault fun will get the first value if not then put the default(0) and then increase freq
        }
        System.out.println(map.size()); //print the size means distinct elements

        for (int i=k; i<arr.length;i++){ // moving from kth element

            if(map.get(arr[i-k]) == 1 ){ //if the last element value is 1
                map.remove(arr[i-k]);
            }
            else {//if not the decrease the freq cause we are removing that element
                map.put(arr[i-k],map.get(arr[i-k])-1);
            }

            map.put(arr[i],map.getOrDefault(arr[i],0)+1); //then put the upcoming kth element

            System.out.println(map.size());
        }
    }
}
