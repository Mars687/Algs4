import java.util.Scanner;

public class Ex05{
    private static Scanner sc;

    public static void main(String args[]){
        sc = new Scanner(System.in);
        System.out.println("Please enter 2 number:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        System.out.println((x > 0 && x < 1) && (y > 0 && y < 1));
    }
}