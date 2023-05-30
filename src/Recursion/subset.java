package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subset {
    public static void main(String[] args) {

        int arr[] = {1,2,3};

        System.out.println(subsets(arr));

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        //List<Integer> list = new ArrayList<>();
        int index = 0;
        solve(nums,new ArrayList<>(),index,ans);
        return ans;
    }

    public static void solve(int nums[],List<Integer> list,int index,List<List<Integer>> ans){

        if(index >= nums.length){
           // System.out.println(list);
            ans.add(new ArrayList<>(list));
            return;
        }

        //exlude element
        solve(nums,list,index+1,ans);

        //include element
        int ele = nums[index];
        list.add(ele);
        solve(nums,list,index+1,ans);
        list.remove(list.size()-1);
    }
}
