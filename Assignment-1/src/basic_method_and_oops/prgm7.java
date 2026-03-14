package basic_method_and_oops;

public class prgm7 {
    static class EncapsulationDemo {
        private int age;
        public void setAge(int age){
            this.age = age;
        }
        public int getAge(){
            return age;
        }
    }
    public static void main(String[] args){
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setAge(21);
        System.out.println(obj.getAge());
    }
}
