package Stack;

import java.util.Stack;

public class MaxAreaHistogram {
    public static void main(String[] args) {

        int arr[] = {4,2,1,5,6,3,2,4,2};

        int ans = maxArea(arr);
        System.out.println(ans);
    }

    //just find the prev smaller same as prev ques the only diff is here we are storing the index
     static int[] previousSmaller(int arr[]){
        int pre[] = new int[arr.length];
         Stack<Integer> stack = new Stack<>();

         for (int i=0; i< arr.length;i++){

             while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                 stack.pop();
             }

             if(stack.isEmpty()){
                 pre[i] =-1;
             }else {
                 pre[i] = stack.peek();
             }

             stack.push(i);//storing index
         }
         return pre;
     }

    static int[] nextSmaller(int arr[]){
        int next[] = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for (int i= arr.length-1; i>0;i--){

            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            if(stack.isEmpty()){
                next[i] =arr.length;//here we are not adding -1 so we add the last index+1
            }else {
                next[i] = stack.peek();
            }

            stack.push(i);
        }
        return next;
    }

    static int maxArea(int arr[]){
        int maxAns =0;
        int[] prev = previousSmaller(arr);
        int[] next = nextSmaller(arr);

        for(int i=0; i<arr.length; i++){
            int curr = (next[i] - prev[i] - 1) * arr[i]; //finding area
             maxAns = Math.max(maxAns,curr);//max among all
        }

        return maxAns;
    }
}
