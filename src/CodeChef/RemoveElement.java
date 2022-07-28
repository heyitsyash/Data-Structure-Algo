package CodeChef;

import java.util.Scanner;

public class RemoveElement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i =0; i< n; i++){
                arr[i] = sc.nextInt();
            }

            removeElement(arr,k);
        }
    }

    public static void removeElement(int[] arr, int k){


        if(arr.length == 1){
            System.out.println("YES");
            return;
        }

        boolean isTrue = false;
        for (int i=0;i< arr.length;i++){
            for (int j=i+1 ; j< arr.length;j++){
                if (arr[i] + arr[j] <= k){
                    isTrue = true;
                }
            }
        }

        if (isTrue == true){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
