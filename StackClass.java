//Lecture 30 :- Stack
//________________________STACK______________________//

import java.util.*;
// public class Lecture30 {
    /* 
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Stack{
        public static Node head; //Stack ka top
        // Stack is empty or not
        public static boolean isEmpty(){
            return head == null;
        }

        //_____________PUSH_____________//
        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //_____________POP_____________//
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //_____________PEEK_____________//
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        // Lecture30  s = new Lecture30 ();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/

//____________IMPLEMENTATION USING ArrayList_______________//

    
/*class Stack {
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size() == 0;
    }

    //_____________PUSH_____________//
    public static void push(int data){
        list.add(data);
    }

    //_____________POP_____________//
    public static int pop(){
        if(isEmpty()){
            return -1;
        }
        int top = list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }

    //_____________PEEK____________//
    public static int peek(){
        if(isEmpty()){
            return -1;
        }
        return list.get(list.size()-1);
    }

    public static void main(String[] args) {
        // Lecture30  s = new Lecture30 ();
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/


//___________COLLECTION FRAMEWORK___________//

/* 
public class StackClass{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/


// Q.1 Push at the bottom of stack // o/p 4->1->2->3
//uses recursion -> types 1: Implicit // 2. Explicit
//St.1 remove top ele 
//st.2 empty stack -> push ele
//st.3 push remaining ele 
//upper -> removde //neeche -> push 
/* 
public class StackClass{
    public static void pushAtBottom(int data , Stack<Integer> s){
        //If stack is completely empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(4 , s);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}*/


//Q.2 Reverse a Stack
public class StackClass{
    public static void pushAtBottom(int data , Stack<Integer> s){
        //If stack is completely empty
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(data , s);
        s.push(top);
    }

    //______________REVERSE____________//
    public static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top , s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse(s);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}




