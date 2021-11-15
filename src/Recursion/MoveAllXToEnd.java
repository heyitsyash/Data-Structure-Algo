package Recursion;

//QUES Move all X to the end of the String
public class MoveAllXToEnd {
    public static void main(String[] args) {

        String str = "AXBCDXXZ";

        moveAllX(str,0,0,"");
    }

    static void moveAllX(String str,int index, int count,String newString){

        if(index == str.length()){ //base case

            for(int i=0; i<count;i++){ //before printing new String add the x at the end count multiple times
                newString += 'X';
            }
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(index); //first char
        if(currChar == 'X'){ //if it is x then get the count and call the func again
            count++;
            moveAllX(str,index+1,count,newString);
        }
        else { //if it's not then add the char in the newString and call the func
            newString += currChar;
            moveAllX(str,index+1,count,newString);
        }
    }
}
