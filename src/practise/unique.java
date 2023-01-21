package practise;

import java.util.HashSet;

public class unique {
    public static void main(String[] args) {

        String words[] = {"jm" , "ayuj"};

        HashSet<String> set = new HashSet<>();
        for(int i=0;i< words.length;i++){
            set.add(words[i]);
        }

        for(String s : set){
            System.out.println(s);
        }
    }

//    static int uni(int n , String words[]){
//
//        HashSet<String> set = new HashSet<>();
//
//        for(int i=0;i<n;i++){
//            set.add(words[i]);
//        }
//
//        for(String s : set){
//            System.out.println(s);
//        }
//    }
}
