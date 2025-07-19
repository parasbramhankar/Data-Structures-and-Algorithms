package LinkedList.SinglyLinkedList.Operations.Traversal_and_FindLengthOfTheLinedList;

public class Solution {

    static int display(Node head){
        int length=0;
        Node temp=head;

        while(temp!=null){
            length++;
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

        return length;
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);


        System.out.println("Linked List: ");
        int length=display(head);

        System.out.println("\nsize of the linked list:"+length );


    }
}
