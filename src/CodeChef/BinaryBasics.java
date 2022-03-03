package CodeChef;

import java.util.Scanner;

public class BinaryBasics {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- != 0){

            int n= sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();

            String str = sc.nextLine();

            int count = isPalindrome(str);

            if(count <= k){

                if(str.length()% 2 ==1){
                    System.out.println("YES");
                }
                else{
                    if((k - count) % 2 == 0){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }else{
                System.out.println("NO");
            }

        }
        sc.close();
    }

    public static int isPalindrome(String str){
        int low = 0;
        int high = str.length()-1;
        int count = 0;

        while(low < high){

            if(str.charAt(low++) != str.charAt(high--)){
                count++;
            }
        }
        return count;
    }
}
