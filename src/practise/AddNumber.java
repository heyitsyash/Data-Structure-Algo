package practise;

public class AddNumber {

    public static void main(String[] args) {

        int a = 125;
        int b = 229;
        int result =0;
        System.out.println(a+b);

        while(a !=0 && b!= 0){

           int ans = a%10 + b%10;
           int carry = ans/10;
           result = result *10 + carry + ans%10;

           a/=10;
           b/=10;
        }

        System.out.println(result);
    }
}
