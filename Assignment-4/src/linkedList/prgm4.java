package linkedList;
class LinkedLists3 {
    Node head;
    private int size;
    LinkedLists3() {
        size = 0;
    }
    public class Node {
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
    public void deleteTarget(String target) {
        if (head==null) {
            System.out.println("empty list: can't remove target");
            return;
        }
        if (head.data.equals(target)) {
            head = head.next;  // move the head to next or 2nd node
            size--;
            return;
        }
        Node previous = null;
        Node current = head;
        while (current != null && !current.data.equals(target)) {
            previous=current;
            current=current.next;
        }
        if (current==null) {
            System.out.println("target not found");
        }
        previous.next = current.next;
        size--;
    }
    public static void main(String[] args) {
        LinkedLists3 sll = new LinkedLists3();
        sll.addFirst("Java");
        sll.addFirst("DSA In");
        sll.addFirst("learning");
        sll.addFirst("I am");
        sll.printList();
        sll.deleteTarget("I am");
        sll.printList();
        sll.deleteTarget("Java");
        sll.printList();
    }
}
