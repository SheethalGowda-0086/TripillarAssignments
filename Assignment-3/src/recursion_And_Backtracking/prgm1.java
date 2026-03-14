package recursion_And_Backtracking;
import java.util.Scanner;
public class prgm1 {
    static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//        int n = sc.nextInt();
        int n = 5;
        printNumbers(n);
    }
}
