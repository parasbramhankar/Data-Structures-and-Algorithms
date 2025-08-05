package LinkedList.DoublyLinkedList.Operations.Deletion;

public class FromStart {
    static void displayDLL(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) System.out.print("->");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node deleteStartingNode(Node head) {
        // If the list is empty or has only one node, return null
        if (head == null || head.next == null) {
            return null;
        }

        // Move head to next node
        head = head.next;

        // Remove backward link from new head to old head
        head.prev = null;

        // Return new head
        return head;
    }


    public static void main(String[] args) {

        Node head=new Node(10);
        head.next=new Node(20,null,head);
        head.next.next=new Node(30,null,head.next);
        head.next.next.next=new Node(40,null,head.next.next);
        head.next.next.next.next=new Node(50,null,head.next.next.next);
        head.next.next.next.next.next=new Node(60,null,head.next.next.next.next);

        System.out.println("Before deletion: ");
        displayDLL(head);

        head=deleteStartingNode(head);

        System.out.println("After deletion: ");
        displayDLL(head);

    }
}
