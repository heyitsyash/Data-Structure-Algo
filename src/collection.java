import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class collection {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(45);
        list.add(12);
        list.add(76);
        list.add(55);
        list.add(23);

        list.remove(5);
        list.add(2,44);
       // System.out.println(list.indexOf(45));
        list.set(1,5);
       // System.out.println(list.contains(23));

        System.out.println(list);

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(24);
        list1.add(25);
        list1.add(26);
        list1.add(27);
        list1.add(28);
        list1.add(29);
        list1.add(30);
        list1.add(31);

        list1.addAll(list);

        System.out.println(list1);

        Stack<Integer> list2 = new Stack<>();

        list2.push(789);
        list2.push(784);
        list2.push(785);
        list2.push(787);
        list2.push(782);
        list2.push(784);


        System.out.println(list2);



        //practise

        long age = 5555555555555L;
        float ni = 41.2555f;
        double kk = 4524.222587;

        String s = "yash is cool";
        s.replace('c','f');

    }
}
