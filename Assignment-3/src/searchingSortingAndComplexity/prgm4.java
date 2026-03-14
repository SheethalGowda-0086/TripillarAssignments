package searchingSortingAndComplexity;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prgm4 {
    public static void selectionSort(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            int MinIndex = i;
            for (int j=i+1;j< arr.length; j++) {
                if (arr[j] < arr[MinIndex]) {
                    MinIndex = j;
                }
            }
            if (MinIndex != i) {  // wht we thought to be min, is wrong
                // swap
                int temp = arr[i];
                arr[i] = arr[MinIndex];
                arr[MinIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,-3,-7,5,-8,4,9,-6};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
