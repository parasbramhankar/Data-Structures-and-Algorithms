package LinkedList.SinglyLinkedList.Operations.Insertion;


import java.util.Scanner;

public class LinkedList {
    static void display(Node head) {
        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println(temp.data);  // this is done only for the -> to print after the element
                                        // If we do not want to add, "->", then we can use the  while(temp!=null)
                                        //which iterate up to the last element of the linked list
        System.out.println();
    }

    Node head;

    public Node insert(int[] arr) {
        head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Creating the linked list
        LinkedList list = new LinkedList();

        int[] arr = new int[]{10, 20, 30, 40};
        Node head = list.insert(arr);

        //Display list
        System.out.println("Initial LinkedList: ");
        display(head);

        //Insert At Beginning
        System.out.println("Enter value to insert at beginning: ");
        int val= scanner.nextInt();

        head =AtBeginning.insertAtBeginning(head,val);
        System.out.println("After insertion at beginning: ");
        display(head);

        //Insertion at last
        System.out.println("Enter value to insert at last: ");
        val= scanner.nextInt();
        head=AtEnd.insertAtEnd(head,val);
        System.out.println("After insertion at end: ");
        display(head);

        //Insertion at any position
        System.out.println("Enter the position where you want to insert the elements: ");
        int pos= scanner.nextInt();

        System.out.println("Enter value to insert at position "+pos+": ");
        val= scanner.nextInt();
        head=AtAnyPosition.insertAtAnyPosition(head,pos,val);
        System.out.println("After insertion at end: ");
        display(head);


    }

}
