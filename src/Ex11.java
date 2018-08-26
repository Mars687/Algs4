import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Ex11 {
    public static void main(String[] args) {
        boolean[][] a = new boolean[10][10];
        a = RandomInitial(a); // Initialize array a randomly
        ArrayPrint(a); // Print array
        BooleanArrayPrint(a); // Print boolean array
        }
    
    public static void ArrayPrint(boolean [][]a){
        for(int i = 0; i < a.length; i++){
            StdOut.print(i+"   ");
            for(int j = 0; j < a.length; j++){
                if(a[i][j])
                    StdOut.print("1"+" ");
                else
                    StdOut.print("0"+" ");
                    
            }
            StdOut.println();
        }
        StdOut.println();
    }
    
    public static void BooleanArrayPrint(boolean [][] a){
         for(int i = 0; i < a.length; i++){//打印行号
             StdOut.print(i+"   ");
             for(int j = 0; j < 10; j++){
                 if(a[i][j])
                     StdOut.print("*"+" ");
                 else
                     StdOut.print(" "+" ");
                 }
                 StdOut.println(" ");
             }
         }
    
    public static boolean[][] RandomInitial(boolean[][]a){
         for(int i = 0; i < a.length; i++){
             for(int j = 0; j < a.length; j++){
                 if(StdRandom.bernoulli(0.1))    
                     a[i][j] = true;
                 else
                     a[i][j] = false;
             }
         }
         return a;
    }
}