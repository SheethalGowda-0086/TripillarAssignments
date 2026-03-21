package linkedList;
class LinkedLists2 {
    Node head;
    private int size;
    LinkedLists2() {
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
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head==null) {
            head=newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedLists2 sll = new LinkedLists2();
        sll.addLast("Sapthagiri");
        sll.addLast("college");
        sll.addLast("of Engineering");
        sll.printList();
    }
}
