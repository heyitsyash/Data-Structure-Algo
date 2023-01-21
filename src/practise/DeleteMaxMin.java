package practise;

import java.util.Arrays;

public class DeleteMaxMin {

    public static void main(String[] args) {

        int n = 101;

        String dup = String.valueOf(n);
        char arr[] = dup.toCharArray();
        Arrays.sort(arr);
        char min = arr[0];
        char max = arr[arr.length-1];

        String res = dup.replace(min+"","");
        if(res == "") System.out.println("null");
        else
        System.out.println(Integer.parseInt(res.replace(max+"","")));



//
//        int dup =n;
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//
//        while(n >0){
//
//            int last = n%10;
//            if(last > max) max =last;
//            if(last < min) min = last;
//
//            n/=10;
//        }
//
//        String num = String.valueOf(dup);
//        String mi = String.valueOf(min);
//        String ma = String.valueOf(max);
//
//        String res = num.replace(mi,"");
//        System.out.println(Integer.parseInt(res.replace(ma,"")));
    }
}
