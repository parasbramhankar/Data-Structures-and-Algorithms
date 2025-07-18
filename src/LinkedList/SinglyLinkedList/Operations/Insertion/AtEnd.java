package LinkedList.SinglyLinkedList.Operations.Insertion;

public class AtEnd {
   static Node insertAtEnd(Node head, int value) {
         Node newNode=new Node(value);
       // If the list is empty, return new node as head
       if (head == null) {
           return newNode;
       }
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }
}
