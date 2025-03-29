// Lecture 28 
//________________________REVERSE LINKED LIST_______________________//

public class ReverseLL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add First 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        head.next = head;
        head = newNode;
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

    //reverse Recursive
    public Node reverseRecursive(Node head){
        if(head == null || head.next == null){
            return head; //Empty list or Single node
        }

        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    //Print
    public void printLL(){
        if(head == null){
            System.out.println("Linked List is empty");
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ " -> ");
            currNode = currNode.next;
        }
        System.out.print(" NULL ");
    }
    public static void main(String args[]){
        ReverseLL list = new ReverseLL();

        list.addFirst("list");
        list.addFirst("is");
        list.addFirst("a");
        list.addFirst("This");
        list.printLL();

        list.reverseIterate();
        list.printLL(); 

        list.head = list.reverseRecursive(list.head);
        list.printLL(); 
    }
}