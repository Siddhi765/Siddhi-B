// Lecture27
//____________________LINKED LISTS____________________//

//NULL -> cpp
//null -> java
// import java.util.*;

public class LL {
    Node head; // It is acessible for all code
    private int size;

    LL() {
        size = 0; // Innitialize size to zero
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add :- first,last,middle
    // add :- first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add :- Last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        // Traverse :- currentNode -> next -> null ==> currentNode = currentNode.next
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    // add :- middle
    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }
        size++;

        Node newNode = new Node(data);
        if (head == null || index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node currNode = head;
        for (int i = 1; i < size; i++) {
            if (i == index) {
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode = currNode.next;
        }
    }

    // Delete :- first,last
    // delete :- first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        size--;
    }

    // delete :- last
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        // When only one node is present
        // head.next = null -> lastNode = null aur null.next toh hain nahi
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }

    // Print the size of LinkedList
    public int getSize() {
        return size;
    }

    // Print LL
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
        }
        Node currNode = head;
        // Dont write currNode.next != null becz in output you will not get LastNode at
        // the time of printing the list
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL ");
    }

    //reverse (iterate)
    public void reverseIterate(){
        if(head == null || head.next == null){
            return; //Empty list or Single node
        }

        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    //ReverseRecursive 
    public Node reverseRecursive(Node head){
        //empty || last node or single node
        if(head == null || head.next == null){
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst(" This");
        list.printList(); // O/P :- This -> is -> a -> NULL

        list.reverseIterate();
        list.printList(); // O/P :- a -> is ->  This -> NULL

        list.head = list.reverseRecursive(list.head);
        list.printList(); // O/P :- 

        list.addLast("Linked List");
        list.printList();
        // O/P :- This -> is -> a -> Linked List -> NULL

        list.deleteFirst();
        list.printList();
        // O/P :- is -> a -> Linked List -> NULL

        list.deleteLast();
        list.printList();
        // O/P :- This -> is -> a -> NULL

        System.out.println(" Size of list is: " + list.getSize());
        // O/P :- Size of list is: 2

        list.addFirst("This");
        list.printList(); // O/P :- This -> is -> a -> NULL

        System.out.println(" Size of list is: " + list.getSize());
        // O/P :- Size of list is: 3
    }
}




// // _________________LL BY USING COLLECTION FRAMEWORK___________________//



// import java.util.*; // You can also use this but instead of this use below becz of size of code is increases if we use "import java.util.*;"

// class LL {
//     public static void main(String args[]) {
//         LinkedList<String> list = new LinkedList<String>();

//         list.addFirst("a");
//         list.addFirst("is");
//         System.out.println(list);

//         list.addFirst("This");
//         list.addLast("LIST"); // If we write add("__") then it will automatically add the data ata last by default
                              
//         System.out.println(list);

//         // Reverse
//         Collections.reverse(list);

//         // Size of list
//         System.out.println("Size of list is: " + list.size());

//         // Loop/iterate
//         for (int i = 0; i < list.size(); i++) {
//             System.out.print(list.get(i) + " -> ");
//         }
//         System.out.println("null ");

//         list.removeFirst();
//         System.out.println(list);

//         list.removeLast();
//         System.out.println(list);

//         list.remove(0);
//         System.out.println(list);

//         // Search
//         // for(int i = 0; i < list.size(); i++){
//         // if(list.get(i) == value)
//         // System.out.println(list.get(i)+ " -> ");
//         // }
//     }
// }