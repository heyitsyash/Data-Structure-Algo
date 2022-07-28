package CollectionFramework;

import com.sun.source.tree.Tree;

import java.util.*;

public class Basics {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.get(Integer.valueOf(2));


        List<String> ll = new LinkedList<>();
        LinkedList<String> lll = new LinkedList<>();

        Stack<Integer> stack = new Stack<>();
        List<Integer> stack1 = new Stack<>();

        Set<Integer> set = new HashSet<>();
        //It just has unique elements
        HashSet<Integer> set1 = new HashSet<>();

        //It has unique elements and order is maintained
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        //It has unique elements in sorted manner and
        TreeSet<Integer> treeSet = new TreeSet<>();

        //queue is a interface it can only be implemented through linkedlist or ArrayDequeue
        Queue<Integer> queue = new LinkedList<>();

        Map<Integer,String> map = new HashMap<>();
        HashMap<Integer,String> map1 = new HashMap<>();

        LinkedHashMap<String ,Integer> lmap =new LinkedHashMap<>();
        TreeMap<String,Integer> treeMap = new TreeMap<>();


    }
}
