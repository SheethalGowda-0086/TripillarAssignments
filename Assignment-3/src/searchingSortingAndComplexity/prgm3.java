package searchingSortingAndComplexity;

import java.util.Arrays;

public class prgm3 {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {  // no. of iterations (n-1)
            for (int j = 0; j < n - i; j++) {  // second last element (n-2)
                // (n-i) -> each iteration we can remove the sorted(largest) element
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j] & arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,6,4,5,9,7,8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
