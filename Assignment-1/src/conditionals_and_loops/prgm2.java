package conditionals_and_loops;

import java.util.Scanner;

public class prgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a = sc.nextInt();
        System.out.println("enter the value of b:");
        int b = sc.nextInt();
        System.out.println("enter the value of c:");
        int c = sc.nextInt();
        if (a > b && a > c) {
            System.out.println("a is largest ");
        } else if (b > a && b > c) {
            System.out.println("b is largest");
        } else {
            System.out.println("c is largest");
        }
    }
}
