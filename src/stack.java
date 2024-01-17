import java.util.*;
/*
//Implementation Using Array
public class stack {
    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
           return list.size()==0;
        }
        //Push Function
        public static void push(int data){
            list.add(data);
        }

        //Pop Function
        public static int pop(){
            int top = list.get(list.size()-1);
            list.remove(list.size()-1); //remove last element from stack
            return top;
        }

        //Peek Function
        public static int peek(){
            return list.get(list.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }

}
 */
//================================Actual Implementation of Stack ============================================
/*public class stack{
    public static void main(String[] args) {
        //Stack s = new Stack();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }

}

 */
//============================================================================================================
//Q.Push at the Bottom of the Stack
//Recursion is used ...

import java.util.Stack;

public class stack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}

