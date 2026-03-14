package basic_method_and_oops;

import java.util.Scanner;

public class prgm1 {
    static int square(int n) {
        n = n*n;
        return n;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("square of the number is " + square(n));
    }
}
