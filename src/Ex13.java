import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex13 {
    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int [][]a = new int[m][n];
        int [][]b = new int[n][m];
        a = RandomInitial(a,n);
        b = TransposedArray(a,b);
        ArrayPrint(b);
    }
    
    public static int[][] RandomInitial(int [][] a, int N){
        StdOut.println("Initialize two-dimensional array:");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                a[i][j] = StdRandom.uniform(N);
                StdOut.print(a[i][j]+" ");
            }
            System.out.println();
        }
        return a;
    }
    
    public static int[][] TransposedArray(int [][]a, int [][]b){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
    
    public static void ArrayPrint(int [][]a){
        System.out.println("Output transposed array:");
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[0].length; j++){
                StdOut.print(a[i][j]+" ");
            }
        System.out.println();
        }
    }
}
