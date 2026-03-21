package linkedList;
class LinkedLists1 {
    begin head;
    private int size;
    LinkedLists1() {
        size = 0;
    }
    public class begin {
        String data;
        begin next;
        begin(String data) {
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void printList() {
        begin temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data) {
        begin newNode = new begin(data);
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedLists1 sll = new LinkedLists1();
        sll.addFirst("2027");
        sll.addFirst("batch");
        sll.addFirst("EEE");
        sll.printList();
    }
}
