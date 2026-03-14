package basics_and_operators;

import java.util.Scanner;

public class prgm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the radius:");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area:" + area);
    }
}
