package arraysAndCodingPatterns;

public class prgm4 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 7, 2, 10, 9};
        int max = arr[0], second = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
            }
            if (arr[i] > second && arr[i] < max) {
                second = arr[i];
            }
        }
        System.out.println("the second largest number in the array is: " + second);
    }
}
