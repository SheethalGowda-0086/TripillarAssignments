package basics_and_operators;

import java.util.Scanner;

public class prgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("The sum is " + (a+b));
        System.out.println("The diff is " + (a-b));
        System.out.println("The product is " + (a*b));
        System.out.println("The quotient is " + (a/b));
    }
}
