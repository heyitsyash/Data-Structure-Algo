package Recursion;

public class QuickSort {

    public static void main(String[] args) {

        int arr[] = {6 ,3,7, 5, 9, 8};

        quickSort(arr,0,arr.length-1);

        for(int e : arr){
            System.out.print(e + " ");
        }
    }

    public static void quickSort(int arr[] ,int start ,int end){

        if(start >=end) return;

        int pivot = partition(arr,start,end);

        quickSort(arr,start,pivot-1);

        quickSort(arr,pivot+1,end);
    }

    public static int partition(int[] arr, int start, int end) {

        int pivot = arr[start];

        int count =0;

        for(int i =start+1; i<=end;i++){
            if(arr[i] < pivot)count++;
        }

        int pivotIndex = start + count;

        swap(arr,start,pivotIndex);

        int i =start,j = end;

        while(i < pivotIndex && j > pivotIndex){

            while(arr[i] <= pivot) i++;

            while(arr[j] > pivot)j--;

            if(i < pivotIndex && j > pivotIndex){
                swap(arr,i++,j--);
            }
        }

        return pivotIndex;
    }

    static void swap(int arr[], int m, int n) {
        int temp = arr[m];
        arr[m] = arr[n];
        arr[n] = temp;
    }
}
