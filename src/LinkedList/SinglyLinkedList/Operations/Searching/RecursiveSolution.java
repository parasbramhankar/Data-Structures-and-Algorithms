package LinkedList.SinglyLinkedList.Operations.Searching;

import java.util.Scanner;

public class RecursiveSolution {

    static  int recSearch(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=recSearch(head.next,key);

        if(idx==-1){
            return -1;
        }

        return idx+1;

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

        int index=recSearch(head,key);

        if(index==-1){
            System.out.println("Element does not exist in the LL");
        }else {
            System.out.println("Element present at index: "+index);
            System.out.println("Element present at position: "+(index+1));
        }
    }
}
