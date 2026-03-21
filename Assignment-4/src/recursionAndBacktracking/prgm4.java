package recursionAndBacktracking;

import java.util.Scanner;

public class prgm4 {
    static void binaryStrings(int n, String current) {
        if (n == 0) {
            System.out.println(current);
            return;
        }
        binaryStrings(n - 1, current + "0");
        binaryStrings(n - 1, current + "1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        binaryStrings(n, " ");
    }
}
