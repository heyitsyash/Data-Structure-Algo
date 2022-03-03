package CodeChef;

import java.util.Scanner;

//QUES https://www.codechef.com/FEB222C/problems/WCC
public class WorldChessChampion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while(t-- !=0){

            int x = sc.nextInt();

           sc.nextLine();
            String str = sc.next();
            int chef =0;
            int carlsen =0;

            for(int i =0; i<str.length();i++){

                if((str.charAt(i) == 'C')|| str.charAt(i) == 'c'){
                    carlsen += 2;
                }
                else if((str.charAt(i) == 'N') || str.charAt(i) == 'n'){
                    chef+= 2;
                }
                else{
                    chef++; carlsen++;
                }
            }

            int result =0;

            if(carlsen>chef){
                result = 60*x;
            }
            else if(carlsen == chef){
                result = 55*x;
            }else{
                result = 40*x;
            }

            System.out.println(carlsen);
            System.out.println(chef);

            System.out.println(result);

        }
    }
}
