/*public class LinkedList {
    //Created Node class
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    //Methods
    public void addFirst ( int data ){
        //Step 1= Create New node
        Node newNode = new Node ( data );
        if(head == null) {
            head = tail = newNode;
            return ;
        }
        //Step 2 = newNode next = head
        newNode.next = head; //Linking one node with other one
        //Step 3 = Head - newNode
        head = newNode;


    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null ){
            head = tail = newNode;
            return;

        }
        tail.next = newNode;
        tail=newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return ;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx , int data){
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;

        while (i < idx-1){
            temp = temp.next;
            i++;
        }
        //i = idx-1;temp-> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }
        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.print();
            ll.addFirst(2);
            ll.print();
            ll.addFirst(1);
            ll.print();
            ll.addLast(3);
            ll.print();
            ll.addLast(4);
            ll.add(2,9);
            ll.print();


        }

    }

 */
//=========================================================================================================================
//Linked list in java collection framework

/*
import java.util.LinkedList;

public class Linkedlist{
 public static void main(String[] args) {
  //Create
  LinkedList<Integer> ll = new LinkedList<>();

  //Add
  ll.addLast(1);
  ll.addLast(2);
  ll.addFirst(0);
  System.out.println(ll);

  //Remove

  ll.removeLast();
  ll.removeFirst();
  System.out.println(ll);
 }
}


 */
//=======================================================================================================
//Merge sort on linked list
/*
import java.util.LinkedList;

public class Linkedlist{
 public static void main(String[] args) {
  //Create
  LinkedList<Integer> ll = new LinkedList<>();

  //Add
  ll.addLast(1);
  ll.addLast(2);
  ll.addFirst(0);
  System.out.println(ll);

  //Remove

  ll.removeLast();
  ll.removeFirst();
  System.out.println(ll);
 }
}

 */
//======================================================================================================================
//Doubly Linked list
public class Linkedlist{
 public class Node {
  int data;
  Node next;
  Node prev;

  public Node(int data) {
   this.data = data;
   this.next = null;
   this.prev = null;
  }
 }
 public static Node head;
 public static Node tail;
 public static int size;

 //add
 public void addFirst(int data ){
  Node newNode = new Node(data);
  size ++;
  if(head == null){
   head = tail = newNode;
   return;
  }
  newNode.next = head;
  head.prev = newNode;
  head = newNode;
 }
//print
 public void print(){
  Node temp = head;
  while(temp != null){
   System.out.print(temp.data + "<->");
   temp = temp.next;
  }
  System.out.println("null");
 }
 //remove
  public static void main(String[] args) {
   Linkedlist dll = new Linkedlist();
   dll.addFirst(3);
   dll.addFirst(2);
   dll.addFirst(1);

   dll.print();
   System.out.println(dll.size);


  }
 }
