package recursionAndBacktracking;

import java.util.Scanner;

public class prgm3 {
    static int powerOfNum(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * powerOfNum(base, exp - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int base = sc.nextInt();
        System.out.print("Enter exponent: ");
        int exp = sc.nextInt();
        int result = powerOfNum(base, exp);
        System.out.println("Result: " + result);
    }
}
