package LinkedList.DoublyLinkedList.Operations.Deletion;

import java.util.Scanner;

public class FromMiddle {
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

    static Node deleteAtPosition(Node head, int pos) {
        // If the list is empty
        if (head == null) {
            System.out.println("List is empty");
            return null;
        }

        // If deleting the first node
        if (pos == 1) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            return head;
        }

        Node temp = head;

        // Traverse to the (pos - 1)-th node
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // If position is invalid
        if (temp == null || temp.next == null) {
            System.out.println("Deletion is not possible");
            return head;
        }

        Node nodeToDelete = temp.next;
        temp.next = nodeToDelete.next;

        if (nodeToDelete.next != null) {
            nodeToDelete.next.prev = temp;
        }

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

        System.out.println("Enter position: ");
        int pos=new Scanner(System.in).nextInt();

        head=deleteAtPosition(head,pos);

        System.out.println("After deletion: ");
        displayDLL(head);

    }



}
