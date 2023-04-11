package Recursion;

public class PrintName {

    public static void main(String[] args) {

        //name(1,5);
        //System.out.println(sum(5,0));
        
        int arr[] = {1,2,3,4,2,1};
       // reverse(arr,arr.length-1);
        System.out.println(checkPalindrome(arr,0, arr.length-1));
    }

    static void name(int i, int n){

        if(i > n) return;
        System.out.println("yash" + i);
        name(++i,n);
        System.out.println("yash" + i);
    }

    static int sum(int n,int total){

        if( n < 1) return 0;

        sum(--n,total);
        return total += n;
    }
    
    static void reverse(int arr[], int n){
        
        if(n < 0) return;

        System.out.println(arr[n] + " ");
        reverse(arr,--n);
    }

    static boolean checkPalindrome(int arr[],int i, int j){

        if(i >= j) return true;

        if(arr[i] != arr[j]) return false;

      return  checkPalindrome(arr,++i,--j);

    }
}
