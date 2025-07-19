package LinkedList.SinglyLinkedList.Operations.Deletion;

import java.util.Scanner;

public class FromAnyPosition {


    static void removeFromAnyPosition(Node head,int pos){
         if(head==null){
             System.out.println("List is Empty");
             return;
         }

         Node temp=head;

         for(int i=0;i<pos-1;i++){

             if(temp.next==null){
                 System.out.println("List does not have "+pos+"nodes");
                 return;
             }
             temp=temp.next;
         }

         temp=temp.next.next;
    }


    static void display(Node head){

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);


        System.out.println("Linked List Before Deletion: ");
        display(head);

        System.out.println("Enter the  position to delete the node: ");


        int pos=new Scanner(System.in).nextInt();

        removeFromAnyPosition(head,pos);

        System.out.println("Linked List after Deletion: ");
        display(head);

    }


}
