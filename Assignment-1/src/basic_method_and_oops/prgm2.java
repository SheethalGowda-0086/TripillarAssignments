package basic_method_and_oops;

import java.util.Scanner;

public class prgm2 {
    static void check(int n) {
        if(n>0) {
            System.out.println("positive");
        } else if (n<0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        System.out.println("the number is ");
        check(n);
    }
}
