package conditionals_and_loops;

import java.util.Scanner;

public class prgm7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = sc.nextInt();
        if (n<=1) {
            System.out.println("not a prime number");
        }
        boolean isprime = true;
        for (int i=2;i<=n-1;i++) {
            if(n%i==0) {
                isprime=false;
                break;
            }
        }
        if(isprime) {
            System.out.println("is a prime number ");
        }else {
            System.out.println("not a prime number");
        }
    }
}
