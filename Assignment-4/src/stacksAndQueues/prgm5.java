package stacksAndQueues;

import java.util.LinkedList;
import java.util.Queue;

public class prgm5 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Document1");
        queue.add("Document2");
        queue.add("Document3");
        System.out.println("Print Queue: " + queue);
        while (!queue.isEmpty()) {
            String job = queue.poll(); // remove from front
            System.out.println("Printing: " + job);
        }
        System.out.println("All documents printed!");
    }
}
