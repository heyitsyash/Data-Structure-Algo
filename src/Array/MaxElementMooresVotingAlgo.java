package Array;

import java.util.Scanner;

//QUES https://www.geeksforgeeks.org/majority-element/
public class MaxElementMooresVotingAlgo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //maxElement(arr, n);

        MajorityElement majorityElement = new MajorityElement();

        majorityElement.printMajority(arr, n);
    }

    //METHOD 1  Broot Force Algo
    static void maxElement(int arr[], int n) {

        int max = 0;
        int index = -1;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                index = i;
            }
        }

        if (max > n / 2) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Array not found");
        }
    }
}


//METHOD 2 (Using Moore’s Voting Algorithm)
class MajorityElement {

    int findCandidate(int arr[], int n) {

        int maj = 0; // maj index which is set to index = 0
        int count = 1; // whose count is 1

        int i;
        for (i = 0; i < n; i++) {
            if (arr[maj] == arr[i]) {
                count++; // increase the count until we found same element in a row
            } else {
                count--; //either decrease
            }

            if (count == 0) { //if by chance count becomes 0 then set maj to i and set his count to 1
                maj = i;
                count = 1;
            }
        }
        return arr[maj]; //return element at that index
    }

    //printing the element if it is Majority Element
    void printMajority(int arr[], int n) {

        int cand = findCandidate(arr, n);

        if (isMajority(arr, n, cand)) {
            System.out.println(cand);
        } else {
            System.out.println("Max Element Not Found");
        }
    }

    //checking is the element is really present more than n/2 times
    boolean isMajority(int arr[], int n, int cand) {

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == cand) {
                count++;
            }
        }

        if (count > n / 2) {
            return true;
        } else {
            return false;
        }
    }


}
