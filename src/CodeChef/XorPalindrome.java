package CodeChef;

import java.util.Scanner;

public class XorPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-->0){

            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();

            int count0 = 0;
            int count1 = 0;
//            if(n<=2){
//                System.out.println("YES");
//            }
//
//            else {
//                if (n % 2 == 0) {
//
//                    for (int i =0;i<n;i++) {
//                        if (str.charAt(i) == '0') {
//                            count0++;
//                        } else {
//                            count1++;
//                        }
//                    }
//
//                        if(count0%2 ==0 && count1%2 == 0) {
//                            System.out.println("yes");
//
//                        }else if((count0%count1 == 0) || (count1%count0 ==0)){
//                            if()
//                        }else {
//                            System.out.println("no");
//                        }
//                } else {
//                    System.out.println("yes");
//                }
//            }


            for(int i=0;i<n;i++){
                if (str.charAt(i) == '0'){
                    count0++;
                }else {
                    count1++;
                }
            }

            if(n%2 == 0){

                if (count0 == count1){
                    System.out.println("yes");
                }else if(count0 %2==0 && count1%2 == 0){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }


            }else {
                System.out.println("yes");
            }
        }
    }
}
