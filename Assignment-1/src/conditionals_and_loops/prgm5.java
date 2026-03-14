package conditionals_and_loops;

import java.util.Scanner;

public class prgm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(("enter the number:"));
        int n = sc.nextInt();
        for (int i=1; i<=10; i++) {
            System.out.println(n + "X" + i + "=" + n*i);
        }
    }
}
