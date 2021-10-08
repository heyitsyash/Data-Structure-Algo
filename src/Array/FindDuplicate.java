package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//not completely done
public class FindDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(findDuplicates(arr));

    }

    public static List<Integer> findDuplicates(int[] nums) {

        List<Integer> arrList = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }

            if (count >= 2 && !arrList.contains(nums[i])) {
                arrList.add(nums[i]);
            }
        }

        return arrList;
    }

}
