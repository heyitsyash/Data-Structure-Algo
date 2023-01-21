package practise;

public class SumOfMaxDigit {

    public static void main(String[] args) {

        int arr[] = {98,678,54,78};

        System.out.println(max(arr));
    }

    static int max(int arr[]){

        int res = 0;
        for(int i : arr){

            int temp = i;
            int max = 0;
            while(temp > 0){
                int last = temp%10;
                max = Math.max(max,last);
                temp /= 10;
            }

            res+=max;
        }
        return res;
    }
}
