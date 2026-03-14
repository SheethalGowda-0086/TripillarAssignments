package ExcepHandling_Multithreading;

import java.util.Scanner;

public class prgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the age: ");
        int age = sc.nextInt();
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above!");
        }
        System.out.println("Valid age.");
    }
}
