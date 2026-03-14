package ExcepHandling_Multithreading;

public class prgm2 {
    public static void main(String[] args) {
        try {
            int arr[] = new int[3];
            System.out.println(arr[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of range!");
        }
        finally {
            System.out.println("completed");
        }
    }
}
