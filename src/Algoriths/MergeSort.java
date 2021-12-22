package Algoriths;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] ={6,3,7,5,9,8,15,12,26,20};

        mergeSort(arr,0,arr.length-1);

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

    //n this we use divide and conquer method first we divide the array into sub arrays until all elements are free then while returning back we check the elements of sub arrays
    //and put the lower one in new array if while comparing one of the array exceeds than we'll simply put the elements of second one cause they are already sorted  then we'll just
    //copy the elements of new array in our original array

    //6 3 7 5 9 8
    static void mergeSort(int arr[], int start,int end){

//        if(start>=end){
//            return;
//        }
        //if there are atleast 2 elements then only we can divide
        if(start < end){

            int mid = (start+end )/ 2;//find the mid

            mergeSort(arr,start,mid);//recursively divide the first half
            mergeSort(arr,mid+1,end);//recursively divide the second half
            merge(arr,start,mid,end);//conquer the elements
        }
    }

    //in this fun we'll compare the elements and put in asc order in new array and then copy in original array
    static void merge(int arr[], int start,int mid,int end){

        int b[] = new int[start+end+1]; //new array
        //storing the indices
        int i = start;
        int j = mid+1;
        int k = start;

        while(i<=mid && j<=end){ //loop until none of the array exceeds their length (mid & end)

            if(arr[i] < arr[j]){ //if element in 1st array is shorter
                b[k] = arr[i++]; //copy in new array and increase pointer of i
            }else {
                b[k] = arr[j++]; //if element in 2nd array is shorter
            }
            k++; //increase the pointer k which is looping through new array
        }

        if(i>mid){ //in case first sub array exceeds (means no element left in first array to compare)
            while (j<=end){ //then simply copy second's element
                b[k++] = arr[j++];
            }
        }

        else { //else if second sub array exceeds
            while (i<=mid){ //copy first elements
                b[k++] = arr[i++];
            }
        }

     for (k=start;k<=end;k++){ //copy the elements od new array back in our original array
         arr[k] = b[k];
     }

    }
}
