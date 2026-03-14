package recursion_And_Backtracking;

public class prgm3 {
    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci series: ");
        for(int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    public static int fib(int n) {
        if(n == 0) return 0; // base case
        if(n == 1) return 1; // base case
        return fib(n - 1) + fib(n - 2); // recursive call
    }
}

