package Recursion;

public class MergeSort {

    public static void main(String[] args) {

        int arr[] = {3,8,6,5,1,12,12,12,7,2,10};

        sort(arr,0, arr.length-1);

        for (int i : arr){
            System.out.print(i + " ");
        }
    }

    public static void sort(int arr[],int start,int end){

        if(start >= end)return;

        int mid = start + (end - start)/2;

        //dividing left part
        sort(arr,start,mid);

        //solving right part
        sort(arr,mid+1,end);

        //merging sorted arr
        merge(arr,start,mid,end);
    }

    public static void merge(int arr[],int start,int mid,int end){

        //making two duplicate array anf copying elements in them
        int n1 = mid - start +1;
        int n2 = end - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        int index = start;
        for(int i=0; i<n1;i++){
            left[i]= arr[index+i];
        }

         index = mid+1;
        for(int i =0;i<n2;i++){
            right[i] = arr[index++];
        }

        //Now using merge two sorted array algo
        int k = start;
        int i =0,j=0;

        while (i < n1 && j < n2){

            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else {
                arr[k++] = right[j++];
            }
        }

        while(i < n1){
            arr[k++] = left[i++];
        }

        while (j < n2){
            arr[k++] = right[j++];
        }

    }
}
