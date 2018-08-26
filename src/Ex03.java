import java.util.Scanner;

public class Ex03{
    private static Scanner sc;

    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("Please enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && a == c) {
            System.out.println("Equal");
        }else{
            System.out.println("Not equal");
        }
    }
}