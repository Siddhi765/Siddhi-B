//Lecture 31 :- Queue
//________________________QUEUE______________________//
//Implementation(Array and LL)/basic/collection framework
//Example :- make straight line

import java.util.*;
public class QueueY {
    /*static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;

        //No need to make front because it is already zero

        Queue(int n){
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty(){
            return rear == -1; 
        }

        public static boolean isFull(){
            return rear == size - 1;
        }

        //Enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }

            //rear ko inc karenge toh khali idx ko point karega aur fir waha pe store karenge
            rear++;
            arr[rear] = data;
        }

        //Dequeue
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            //Remove karane keliye rear ke 0th idx ke element ko acces karenge
            int front = arr[0]; //0th idx hata diye fir piche ke ele ko ek ek karake aage push karenge
            for(int i = 0 ; i < rear; i++){
                arr[i] = arr[i+1];
            }
            //rear ko chage kara 
            rear--;
            return front;
        }

        //Peek :- Front element 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }

            //Remove karane keliye rear ke 0th idx ke element ko acces karenge
            return arr[0]; //0th idx hata diye fir piche ke ele ko ek ek karake aage push karenge
        }


    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3); //1 2 3 
        
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }*/


    //________________CIRCULAR QUEUE USING ARRAY______________________//
    /*static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;
        //No need to make front because it is already zero

        Queue(int size){
            this.size = size;
            arr = new int[size];
        }

        public static boolean isEmpty(){
            return rear == -1 && front == -1; 
        }

        public static boolean isFull(){
            return (rear + 1) % size == front ;
        }

        //Enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("Full Queue");
                return;
            }
            //1st element
            if(front == -1){
                front = 0;
            }
            //rear ko inc karenge toh khali idx ko point karega aur fir waha pe store karenge
            rear  = (rear + 1) % size;
            arr[rear] = data;
        }

        //Dequeue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int result = arr[front]; 

            //if only 1st element is present 
            if(front == rear){
                rear = front = -1;
            }
            else{
                front = (front + 1) % size;
            }

            return result;
        }

        //Peek :- Front element 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3); //1 2 3 
        q.add(4);
        q.add(5);
        
        System.out.println(q.remove());
        q.add(6);

        System.out.println(q.remove());
        q.add(7);

        while(!q.isEmpty()){
            System.out.println( q.remove());
        }
    }*/


    //________________IMPLEMENTATION USING LL__________________//
    /*static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null; 
        }

        //Enqueue
        public static void add(int data){
            Node newNode = new Node(data);
            if(tail == null){
                head = tail = newNode;
                return;
            }
            //1st element 
            tail.next = newNode;
            tail = newNode;
        }

        //Dequeue 
        public static int remove(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            int front = head.data;
            //Single element in LL
            if(head == tail){
                tail = null;
            }
            head = head.next;
            return front;
        }

        //Peek :- Front element 
        public static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3); 
        q.add(4);
        q.add(5);

        q.remove(); //2 3 4 5

        while(!q.isEmpty()){
            System.out.println( q.peek());
            q.remove();
        }
    }*/


    //_______________________COLLECTION FRAMEWORK________________________//

    /*public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // Queue is a interface and we cannot create obj of queue therefore we use LL
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3); 
        q.add(4);
        q.remove(); //2 3 4 5
        q.add(5);

        while(!q.isEmpty()){
            System.out.println( q.peek());
            q.remove();
        }

    }*/



    //__________________IMPLEMENT QUEUE USING 2 STACK__________________//

    static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty();
        }

        //Add
        public static void add(int data){
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s1.push(data);

            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }

        //Remove
        public static int remove(){
            if(isEmpty()){
                return -1;
            }
            return s1.pop();
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return s1.peek();
        }
    }
    public static void main(String[] args) {
        // Queue<Integer> q = new LinkedList<>(); // Queue is a interface and we cannot create obj of queue therefore we use LL
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3); 
        q.add(4);
        // q.remove(); //2 3 4 5
        q.add(5);

        while(!q.isEmpty()){
            System.out.println( q.peek());
            q.remove();
        }

    }
    
}
