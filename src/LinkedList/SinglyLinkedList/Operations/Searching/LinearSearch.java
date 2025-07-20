package LinkedList.SinglyLinkedList.Operations.Searching;

import LinkedList.SinglyLinkedList.Operations.Searching.Node;

import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(Node head,int key){
        Node temp=head;
        int i=0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
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
        Scanner scanner=new Scanner(System.in);

        //LinkedList
        Node head=new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);


        System.out.println("Linked List: ");
        display(head);

        System.out.println("Enter the  key to searching : ");
        int key= scanner.nextInt();

        int index=linearSearch(head,key);

        if(index==-1){
            System.out.println("Element does not exist in the LL");
        }else {
            System.out.println("Element present at index: "+index);
            System.out.println("Element present at position: "+(index+1));
        }

    }
}
