package Basics;

import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10,1,11,12,13,11,537};

        System.out.println(prime(arr));

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        boolean isTrue = true;
//        for (int j=2;j*j<=n;j++){
//            if (n % j == 0) {
//                isTrue =false;
//                break;
//            }
//            //if(j+1 == arr[i])list.add(arr[i]);
//        }

        //System.out.println(isTrue);

        //Sieve of Erathosenes
//        boolean[] prime = sieveOfEratosthenes(n);
//
//        for(int i=0; i< prime.length;i++){
//            if(prime[i]) System.out.println(i + " is a Prime Number");
//        }
    }

    public static List<Integer> prime(int arr[]){

        Set<Integer> list = new HashSet<>();


        for(int i=0;i<arr.length;i++){
            boolean isPrime = true;
            for (int j=2;j*j<=arr[i];j++){
                if (arr[i] % j == 0) {
                    isPrime = false;
                    break;
                }
                //if(j+1 == arr[i])list.add(arr[i]);
            }
            if (isPrime) list.add(arr[i]);

        }

        return new ArrayList<>(list);
    }

    public static boolean[] sieveOfEratosthenes(int n){

        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);

        arr[0] = false;
        arr[1] = false;
        for(int i =2; i*i <=n; i++){
            for (int j = 2*i; j<=n ;j += i){
                arr[j] = false;
            }
        }

        return arr;
    }
}
