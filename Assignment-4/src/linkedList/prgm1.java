package linkedList;
class LinkedLists {
    Node head;
    private int size;
    LinkedLists() {
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
        LinkedLists sll = new LinkedLists();
        sll.addFirst("C++");
        sll.addFirst("C");
        sll.addFirst("Python");
        sll.addFirst("Java");
        sll.printList();
    }
}
