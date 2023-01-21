package practise;

public class Matrix {

    public static void main(String[] args) {

        int[][] a = {{1 ,2} ,{ 4, 5}};
        int[][] b = {{5, 5} , {7, 6}};
        char c[][] = {{'+', '-'}, {'*' , '/'}};

        sum(a,b,c);
    }

    public static void sum(int[][] a, int[][] b, char[][] c){

        for(int i=0;i < a.length;i++){
            for(int j=0;j<a[0].length;j++){

                switch (c[i][j]){

                    case '+' :{
                        System.out.print(a[i][j] + b[i][j] + " ");
                        break;
                    }

                    case '-' :{
                        System.out.print(a[i][j] - b[i][j] + " ");
                        break;
                    }
                    case '*' :{
                        System.out.print(a[i][j] * b[i][j] + " ");
                        break;
                    }
                    case '/':{
                        System.out.print(a[i][j] / b[i][j] + " ");
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}
