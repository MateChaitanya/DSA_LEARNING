import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.offer("Element 1");
        queue.offer("Element 2");
        queue.offer("Element 3");

        System.out.println("Queue: " + queue);

        // Removing and displaying elements from the queue
        String removedElement = queue.poll();
        System.out.println("Removed Element: " + removedElement);
        System.out.println("Updated Queue: " + queue);

        // Peeking at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front Element: " + frontElement);
        System.out.println("Queue after peek: " + queue);
    }
}

