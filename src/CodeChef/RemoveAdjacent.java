package CodeChef;

import org.w3c.dom.ls.LSException;

import java.util.*;

public class RemoveAdjacent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0){

            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            List<Integer> list = new ArrayList<>();
            for (int i =0; i<n;i++){
                list.add(arr[i]);
            }
            int operation = 0;

            if(list.size() == 1){
                operation = 0;
            }
            else if(list.size() == 2){

                if(list.get(0) == list.get(1)) operation = 0;
                else operation =1;
            }

            else {
                int max = Collections.max(list);
                for (int i = 0; i < list.size() - 1; i++) {
                    if (list.get(i) + list.get(i + 1) == max) {
                        list.set(i, max);
                        list.remove(i + 1);
                        // System.out.println(list + " -----");
                        operation++;
                    }
                }
            }
            System.out.println(operation);
        }
    }
}
