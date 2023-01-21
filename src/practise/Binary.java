package practise;

public class Binary {
    public static void main(String[] args) {

        int m = 5;
        int n = 11;
        String s = "100";
        System.out.println(Integer.parseInt(s,2));

        for (int i =m+1;i<n;i++){
            String b = Integer.toBinaryString(i);
            for(int j=1;j<b.length();j++){
                boolean flag = true;
                if(b.charAt(j-1) == '1' && b.charAt(j) == '1') {
                    flag = false;
                    break;
                }
                if(flag) System.out.println(b);
                break;
            }
        }
    }
}
