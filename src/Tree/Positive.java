package Tree;

import java.util.Scanner;

public class Positive {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] =  new int[n];

        for(int i =0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        changeArray(arr);

        for (int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray(int arr[]){

        int sum = 0;
        int count = 0;
        for (int i : arr){
            if(i > 0){
                sum+=i;
                count++;
            }

        }

        if(count == 0){

            for(int i =0; i<arr.length;i++){
                if(arr[i] < 0) arr[i] = 0;
            }
        }
        else{
            int average  = sum / count;
            System.out.println(average);

            for(int i =0; i<arr.length;i++){
                if(arr[i] < 0) arr[i] = average;
            }
        }
    }
}
