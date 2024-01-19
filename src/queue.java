import java.util.LinkedList;
import java.util.Queue;
/*
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

 */
//===============================================================================================
//Implementation of queue using array
import java.util.LinkedList;
/*
class QueueUsingLinkedList {
    private LinkedList<Integer> list = new LinkedList<>();

    // Add an element to the back of the queue
    public void enqueue(int data) {
        list.addLast(data);
    }

    // Remove and return the element from the front of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Or throw an exception
        }
        return list.removeFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Get the size of the queue
    public int size() {
        return list.size();
    }
}

// Example Usage:
public class queue {
    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        System.out.println("Is Queue Empty? " + queue.isEmpty());
        System.out.println("Queue Size: " + queue.size());
    }
}
*/
//================================================================================

class queue {
    int a[];
    int capacity;
    int rear ;
    public queue(int n){
        capacity = n;
        a = new int [n];
        rear = -1;
    }
    void enqueue ( int data ) throws Exception {
        if (rear == capacity-1){
            throw new Exception();
        }
        rear ++;
        a[rear]=data;
    }
    int dqueue() throws Exception {
        if(rear ==-1){
            throw new Exception();

        }
        int result = a[0];
        for(int  i =0 ; i <rear; i++){
            a[i] = a[i+1];
        }
        rear --;
        return result;
    }
    int getfront() throws Exception {
        if (rear == -1){
            throw new Exception();
        }
        return  a[0];
    }
}
