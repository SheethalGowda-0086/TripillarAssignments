package arraysAndCodingPatterns;

public class prgm1 {
    public static void main(String[] args) {
        int [] arr = {23,36,6,91,34,72};
        int max=arr[0], min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("the largest element is: "+max);
        System.out.println("the smallest element is: "+min);
    }
}
