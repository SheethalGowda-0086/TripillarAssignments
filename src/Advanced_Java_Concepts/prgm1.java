package Advanced_Java_Concepts;

abstract class shape{
    abstract void display();
}
class circle extends shape{
    @Override
    void display() {
        System.out.println("circle");
    }
}
class Demo {
    public static void main(String[] args) {
        circle c = new circle();
        c.display();
    }
}
