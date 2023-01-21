package practise;

public class deloitte {

    public static void main(String args[]){

        String str = "ABC65D19#Y09";
        String res = "";

        for (int i=0;i<str.length();i++){
//            if(str.charAt(i) - '0' >= 0 && str.charAt(i) - '0' <= 9){
//                res = res + i;
//            }
            if(Character.isDigit(str.charAt(i))) res += i;
            System.out.println(Math.sqrt(16));
            str.replaceAll("A","c");

        }

        System.out.println(res);
    }
}
