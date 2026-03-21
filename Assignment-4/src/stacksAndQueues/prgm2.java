package stacksAndQueues;

public class prgm2 {
    int [] arr;
    int size,front,back;
    prgm2(int size){
        this.size=size;
        arr= new int [size];
        front=-1;
        back=-1;
    }
    void push(int val){
        if(back==size-1){
            System.out.println("overflow");
        }
        back++;
        arr[back]=val;
        if(front==-1){
            front++;
        }
    }
    void pop(){
        if(front==-1 || front>back){
            System.out.println("underflow");
            return;
        }
        front++;
    }
    int peek(){
        if(front==-1 || front>back){
            System.out.println("underflow");
            return -1;
        }
        return arr[front];
    }
    boolean isempty(){
        return (front ==-1 || front >back);
    }
    void print(){
        for(int i= front;i<= back;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class driver1{
    public static void main(String[] args) {
        prgm2 q = new prgm2(5);
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        System.out.println(q.peek());
        q.pop();
        System.out.println(q.peek());
        System.out.println();
        q.print();
    }
}
