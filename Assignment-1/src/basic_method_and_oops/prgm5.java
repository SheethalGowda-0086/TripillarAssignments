package basic_method_and_oops;

public class prgm5 {
    static class ConstructorDemo {
        int x;
        ConstructorDemo(int x){
            this.x = x;
        }
        void display(){
            System.out.println(x);
        }
    }
    public static void main(String[] args){
        ConstructorDemo obj = new ConstructorDemo(10);
        obj.display();
    }
}
