// IMP Questions 
public class Lecture29 {
     
    //________________________________________________________________//

    // Q.1. Find the nth node from the end & remove it.
    /* 
    public ListNode removeNthFromLast(ListNode head,int n){
        // If only one node is there
        if(head.next == null){
            return null;
        }
    
        // To calculate size of LL
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
    
        //For printing the curr node
        int indexToSearch = size - n - 1;
        ListNode curr = head;
        int i = 1;
        while(i < indexToSearch){
            curr = curr.next; // Connection break
            i++;
        }
        curr.next = curr.next.next;
        return head;
    
        // When size of LL and n is equal then return head.next
        if(size == n){
            return head.next;
        }
    
        //For removing the node
        // Calculate prev to break the connection
        int indexToSearch = size - n;
        ListNode prev = head;
        int i = 1;
        while(i < indexToSearch){
            prev = prev.next; // Connection break
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }  */

    //________________________________________________________________//

    // Q.2. Check if a LL is a palidrome or not
    //Palidrome :- read from start or end is same e.g. 1->2->1->Null , 1->2->2->1->Null , b->o->b->Null , etc
    
    // findmiddle function
    /* 
    public ListNode findMiddle(ListNode head){
        ListNode hare = head;  // hare -> sasa -> fast
        ListNode turtle = head; // turtle -> kasav -> slow

        while(hare.next != null && hare.next.next != null){
            hare = hare.next.next; // 2 se badhaye
            turtle = turtle.next; // 1 se badhaye
        }
        return turtle; // firstHalfLastNode 
    }

    // reverse function
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public boolean isPalidrome(ListNode head){
        if(head == null || head.next == null){
            return true;
        }

        ListNode middle = findMiddle(head); //1st half ka end 
        ListNode secondHalfStart = reverse(middle.next);

        //comparision 
        ListNode firstHalfStart = head;
        while(secondHalfStart != null){
            //compare
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart = firstHalfStart.next;
            secondHalfStart = secondHalfStart.next;
        }
        return true;
    }
    */

    //________________________________________________________________//

    // Q.3 Detecting Loop in a Linked List.
    /*
    public boolean hasLoop(ListNode head){
        
        // SWhen LL is empty then No Loop is there
        if(head == null){
            return false;
        }

        ListNode hare = head;
        ListNode turtle = head;

        while(hare != null && hare.next != null){
            hare = hare.next.next; // Inc by 2
            turtle = turtle.next; //Inc by one 

            // Meeting of turtle and hare
            if(hare == turtle){
                // Loop is there
                return true;
            }
        }
        // No loop is there
        return false;
    } */
}
