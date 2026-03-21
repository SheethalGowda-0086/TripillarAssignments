package recursionAndBacktracking;

import java.util.Scanner;

public class prgm1 {
    static void printReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printReverse(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int n = sc.nextInt();
        printReverse(n);
    }
}
