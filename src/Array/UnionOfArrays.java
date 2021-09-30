package Array;

import java.util.*;
//Ques
//https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/

public class UnionOfArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }


        //int c = unionArray(a, n, b, m);
        int c = setMethod(a,n,b,m);
        System.out.println(c);

    }

    //simple way "Time Limit will Exceed " in high test cases
    private static int unionArray(int a[], int n, int b[], int m) {

        ArrayList arr = new ArrayList<Integer>();


        for (int i = 0; i < n; i++) {
            arr.add(a[i]);
        }

        for (int i = 0; i < m; i++) {

            if (arr.contains(b[i])) {
                continue;
            } else {
                arr.add(b[i]);
            }
        }

        return arr.size();
    }

    //Efficient way
    private static int setMethod(int a[], int n, int b[], int m) {
        Set<Integer> set = new HashSet<Integer>(); //Set dosen't store duplicate values
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        for (int i = 0; i < m; i++) {
            set.add(b[i]);
        }

        return set.size();
    }
}
