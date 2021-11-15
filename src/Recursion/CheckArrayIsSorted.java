package Recursion;

//QUES Check if arr is Sorted(Strictly Increasing)
public class CheckArrayIsSorted {

    public static void main(String[] args) {

        int arr[] = {1, 3, 3, 9};

        System.out.println(isSorted(arr, 0));
    }

    static boolean isSorted(int arr[], int index) {

        //base case is same
        if (index == arr.length - 1) {
            return true;
        }

        //another way
//        if(arr[index] < arr[index+1]){
//            return isSorted(arr,index+1);
//        }else {
//            return false;
//        }

        //another way
        if (arr[index] >= arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }
}
