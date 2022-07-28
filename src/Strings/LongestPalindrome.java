package Strings;

import java.util.HashMap;

public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "";
        String str = "qyop";

//        StringBuilder s1 = new StringBuilder();
//        s1.insert(0,(char) 'A' + 28%26);
//        System.out.println(s1);
//        System.out.println(802/26)
        int exp = (int) Math.pow(10, 9);
        System.out.println(exp);


    }

    public static int lPalindrome(String s){
        if(s == null || s.length() == 0) return 0;

        if(s.length() == 1) return 1;

        HashMap<Character,Integer> map = new HashMap<>();

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c,0)+1);
        }

        int result =0;
        for(char c : map.keySet()){
            int value = map.get(c);
            if(value/2 > 0) result+= 2 * (value/2);
        }

        if(result>0 && result < s.length()) result++;

        return result;
    }
}
