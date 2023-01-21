package practise;

public class SumOfLeaders {
    public static void main(String[] args) {

        int arr[] = {16,17,4,3,5,2,6};
        System.out.println(sum(arr,arr.length));
    }

    static int sum(int arr[] , int n){

        int res =0;
        for(int i=0; i<n;i++){
            for (int j =i+1;j<n;j++){
                if(!(arr[i] > arr[j])) break;

                if (j == n-1) res += arr[i];
            }
        }
         return res+=arr[n-1];
    }
}
