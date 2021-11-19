package Recursion;

//QUES Find the Subsequence (means the no of formation can be formed with that String)
public class SubsequenceString {
    public static void main(String[] args) {

        String str = "abc";

        subsequence(str,0,"");
    }

    static void subsequence(String str, int idx, String newString){

        if(idx == str.length()){
            System.out.println(newString);
            return;
        }

        //there will be 2 possibility that the char will be added or not
        char currChar = str.charAt(idx);

        //to be
        subsequence(str,idx+1,newString+currChar);

        //or not to be
        subsequence(str,idx+1,newString);

    }
}
