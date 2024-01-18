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
/*
import java.util.Stack;

public class stack {
    // Function to push an element to the bottom of the stack
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }
    // Main method
    public static void main(String[] args) {
        // Creating a stack
        Stack<Integer> s = new Stack<>();
        // Pushing elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        // Calling the function to push 4 to the bottom of the stack
        pushAtBottom(s, 4);
        // Printing and popping elements from the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
*/
//========================================================================================================
//Q.Reverse a String using Stack
/*
public class stack{
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr =s .pop();
            result.append(curr);
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String str ="HELLOWORLD";
        String result = reverseString(str);
        System.out.println(result);

    }
}*/
//===================================================================================================
import java.util.Stack;

public class stack {
    static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : expression.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), bracket)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isMatchingPair(char character1, char character2) {
        return (character1 == '(' && character2 == ')') ||
                (character1 == '[' && character2 == ']') ||
                (character1 == '{' && character2 == '}');
    }

    public static void main(String[] args) {
        String expression = "{[()]}";
        System.out.println("Balanced: " + isBalanced(expression));
    }
}
