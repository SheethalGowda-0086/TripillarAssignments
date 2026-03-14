package arraysAndCodingPatterns;

public class prgm3 {
    public static void main(String[] args) {
        int sum = 0;
        int [] arr = {1,2,3,4,5};
        for (int i=0; i <= arr.length; i++){
            sum += i;
        }
        System.out.println("the sum of the elements is: "+ sum);
    }
}
