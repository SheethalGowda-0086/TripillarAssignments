package ExcepHandling_Multithreading;

class InvalidAgeException extends Exception{
    InvalidAgeException(String msg) { // we hv created a class of our own. -> not a normal class,
        super(msg);                                            // it is exception cls;
    }
}
class Main {
    static void vote(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("age must be atleast 18");
        }
        System.out.println("you can vote");
    }
    public static void main(String[] args) {
        try {
            vote(19);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

