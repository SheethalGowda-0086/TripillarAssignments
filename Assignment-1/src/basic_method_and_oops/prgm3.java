package basic_method_and_oops;

public class prgm3 {
    static class Student {
        String name;
        int marks;

        void display(){
            System.out.println("Name: "+name);
            System.out.println("Marks: "+marks);
        }
    }
    public static void main(String[] args){
        Student s = new Student();
        s.name="Sanjana";
        s.marks=90;
        s.display();
    }
}
