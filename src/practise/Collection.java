package practise;

import java.util.*;

public class Collection {

    public static void main(String[] args) {

        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "yash");
        map.put(2, "jsjh");

//        for(int i: map.keySet()){
//            System.out.println(i + map.get(i));
//        }
        // System.out.println(map);

        TreeSet<Integer> set = new TreeSet<>();
        set.add(1);
        set.add(25);
        set.add(2);
        set.add(0);

//        for(int i:set){
//            System.out.println(i);
//        }

        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(25);
        stack.push(14);

//        for(int i =0; i<stack.size();i++){
//            System.out.println(stack.get(i));
//        }
        stack.add(0, 22);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.add(22);
       // System.out.println(queue.peek());
        queue.add(12);

        //

        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(12);
        ll.get(0);
        ll.add(15);
        ll.add(45);

//        for(int i: ll){
//            System.out.println(i);
//        }

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(12);
        pq.add(17);
        pq.add(22);
        pq.add(45);
        pq.add(3);
        pq.add(19);
//
//        for (int i : pq){
//            System.out.println(i);
//        }

        String s = "flower";
        String s1 = "flowerss";
       String q= s + "ksm";

       StringBuilder stringBuilder = new StringBuilder("this is my");
       stringBuilder.insert(4,s);
       stringBuilder.append(" String");
        System.out.println(stringBuilder);


        System.out.println(s1.lastIndexOf('s'));
        System.out.println(s.contains(s1));
    }
}
