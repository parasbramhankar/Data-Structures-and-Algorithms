package LinkedList.SinglyLinkedList.Operations.Insertion;

public class AtAnyPosition {
    static Node insertAtAnyPosition(Node head, int pos, int val) {
        Node newNode = new Node(val);

        // Case 1: Insert at beginning
        if (pos == 0) {
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        // Traverse to the (pos - 1)th node
        for (int i = 0; i < pos - 1; i++) {
            if (temp == null) {
                // Position is out of bounds
                System.out.println("Position out of bounds");
                return head;
            }
            temp = temp.next;
        }

        // Insert the node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

}
