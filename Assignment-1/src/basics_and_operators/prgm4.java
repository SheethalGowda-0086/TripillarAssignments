package basics_and_operators;

import java.util.Scanner;

public class prgm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in celsius:");
        int c = sc.nextInt();
        double f = (9.0/5.0) * c + 32;
        System.out.println("Temp in fahrenheit is:" + f);
    }
}
