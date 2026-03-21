package linkedList;
class LL {
    Node head;
    public int size;
    LL() {
        size = 0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("C++");
        sll.addFirst("C");
        sll.addFirst("Python");
        sll.addFirst("Java");
        int s = sll.size;
        sll.printList();
        System.out.println(s);
    }
}

