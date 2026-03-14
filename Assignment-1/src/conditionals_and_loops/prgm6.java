package conditionals_and_loops;

import java.util.Scanner;

public class prgm6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        int num=1;
        for (int i=1;i<=n; i++) {
            num*=i;
        }
        System.out.println("factorial of the number is " + num);
    }
}
