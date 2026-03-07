package ExcepHandling_Multithreading;

public class prgm5 {
    static void Method() throws Exception {
        throw new Exception("Something went wrong!");
    }
    public static void main(String[] args) {
        try {
            Method();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
