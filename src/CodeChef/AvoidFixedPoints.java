package CodeChef;

import java.util.*;

//QUES https://www.codechef.com/FEB222C/problems/NOFIX
public class AvoidFixedPoints {

    public static void main(String[] args) {

        try {


            Scanner sc = new Scanner(System.in);

            int t = sc.nextInt();

            while (t-- > 0) {

                int n = sc.nextInt();

                int arr[] = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
                }

                LinkedList<Integer> ll = new LinkedList<>();
                for (int i = 0; i < n; i++) {
                    ll.add(arr[i]);
                }

                int count = 0;


                for (int i = 0; i < n; i++) {
                    int result = 1 + i + count;
                    if (result == arr[i]) {
                        count++;
                    }
                }
                System.out.println(count);
            }
        } catch (Exception e) {
        }
    }
}
