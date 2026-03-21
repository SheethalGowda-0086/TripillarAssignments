package stacksAndQueues;

public class prgm1 {
    int [] arr;
    int top,size;
    prgm1(int size){
        this.size=size;
        arr= new int [size];
        top=-1;
    }
    void push(int val){
        if(top==size-1){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top]=val;
    }
    void pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return;
        }
        top--;
    }
    int top(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top];
    }
    boolean isempty(){
        return top==-1;
    }
}
class driver{
    public static void main(String[] args) {
        prgm1 s = new prgm1(5);
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.top());
    }
}
