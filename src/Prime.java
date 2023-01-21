import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class Prime {

    public static void main(String[] args) {

//        String s = "abcdd";
//        System.out.println(maxElement(s));

        String s =  "Move#Hash#to#Front";
       // System.out.println(moveChar(s.toCharArray(),s.length()));
        long sum = 1234567890+12346;
        BigInteger ans =  new BigInteger("2 + 2");

        System.out.println(BigInteger.valueOf(sum));
    }

    public static int[] prime(int arr[]){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i< arr.length;i++){
            for (int j=0; j<=arr[i]/2;j++){
                if(arr[i] % j ==0) continue;
                else{
                    list.add(arr[i]);
                }
            }
        }
        int result[] = new int[list.size()];
        for (int i=0; i< list.size();i++){
            result[i] = list.get(i);
        }

        return result;
    }

    public int[] RemoveDuplicates(int[] input1 , int input2){

        HashSet<Integer> set = new HashSet<>();
        for(int i: input1){
            set.add(i);
        }

        int result[] = new int[set.size()];

        int k = 0;
       for(int i : set){
           result[k++] = i;
       }

        Arrays.sort(result);
       return result;
    }

    public static String maxElement(String input1)
    {

        int count[] = new int[256];

        int len = input1.length();
        for (int i = 0; i < len; i++)
            count[input1.charAt(i)]++;

         int max = -1;
        char result = ' ';


        for (int i = 0; i < len; i++) {
            if (max < count[input1.charAt(i)]) {
                max = count[input1.charAt(i)];
                result = input1.charAt(i);
            }
        }
        count[result] =0;
        for (int i=0; i< count.length;i++){
             if(count[i] == max) result = '0';
        }

        return result+"";
    }

    public String checkBraces(String input1){

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < input1.length(); i++) {
            char a = input1.charAt(i);
            if(a == '(' || a == '[' || a == '{') stack.push(a);
            else if(stack.empty()) return "error";
            else if(a == ')' && stack.pop() != '(') return "error";
            else if(a == ']' && stack.pop() != '[') return "error";
            else if(a == '}' && stack.pop() != '{') return "error";
        }
        if(stack.empty()) return "correct";
        else return "error";
    }

    public static char[] moveChar(char str[],int n){

        char[] result = new char[n];
        Arrays.fill(result,'#');

        int count=0;
        for (char i : str){
            if(i == '#')count++;
        }

        int j =0;
        for(int i =count; i<n;i++){
            if(str[j++] == '#')continue;
            else result[i] = str[j];
        }

        return result;
    }
}
