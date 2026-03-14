package searchingSortingAndComplexity;

import java.util.Arrays;

public class prgm1 {
    public static int linearSearch(int[] arr, int key) {
        for (int i=0; i< arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,2,-2,9,-6};
        int key = -2;
        int index = linearSearch(arr,key);
        if (index == -1) {
            System.out.println(key + " is not present in the array: "+ Arrays.toString(arr));
        } else {
            System.out.println(key + " is present at index "+index+" in the array: "+Arrays.toString(arr));
        }
    }
}
