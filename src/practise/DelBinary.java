package practise;

public class DelBinary {
    public static void main(String[] args) {

        String input = "xuuab";
        String vowel ="aeiouAEIOU";
        String result = "";

        for(int i =0;i <input.length();i++){
            char c = input.charAt(i);
            if (vowel.contains(c +"")) result+="0";
            else result+="1";
        }

        System.out.println(Integer.parseInt(result,2));
    }
}
