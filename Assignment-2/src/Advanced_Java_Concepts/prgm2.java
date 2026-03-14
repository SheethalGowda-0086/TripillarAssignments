package Advanced_Java_Concepts;

interface vehicle{
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("we pray for cars.");
    }
}
class demo1 {
    public static void main(String[] args) {
        car c = new car();
        c.start();
    }
}
