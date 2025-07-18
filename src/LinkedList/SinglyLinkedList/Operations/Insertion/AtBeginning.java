package LinkedList.SinglyLinkedList.Operations.Insertion;

public class AtBeginning {
   static Node insertAtBeginning(Node head,int value){
      Node node = new Node(value); // create a new node with the given value
      node.next = head;            // point new node's next to current head
      head = node;                 // update head to the new node
      return head;                 // return the new head
   }
}
