package searchingSortingAndComplexity;

import java.util.Arrays;

public class prgm2 {
    public static int binarySearch(int[] arr,int key){
        int s=0, e= arr.length-1;
        while (s<=e) {
            int mid = s+(e-s)/2;
            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] < key) {
                s=mid+1;
            } else e=mid-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,5,7,9,11};
        int key =11;
        int index = binarySearch(arr,key);
        if (index == -1) {
            System.out.println(key + " is not present in the array: "+ Arrays.toString(arr));
        } else {
            System.out.println(key + " is present at index "+index+" in the array: "+Arrays.toString(arr));
        }
    }
}
