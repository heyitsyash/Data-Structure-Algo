package Algoriths;

public class dummy {

    public static void main(String[] args) {

        int count = 0;

        int ans = refer(count,0);

        System.out.println(ans);

    }

    public static int refer(int count,int i){

        if( i > 5) return count;

        count+=1;

        return refer(count,i+1);
    }

}

