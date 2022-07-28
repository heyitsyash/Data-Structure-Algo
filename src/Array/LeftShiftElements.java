package Array;

import java.util.ArrayList;
import java.util.List;

public class LeftShiftElements {

    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);



        System.out.println( rotateLeft(2,arr));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here

        List<Integer> list = new ArrayList<>();

        for (int i =d; i< arr.size(); i++){
            list.add(arr.get(i));
        }

        for (int i=0; i<d;i++){
            list.add(arr.get(i));
        }

        return list;
    }

}
