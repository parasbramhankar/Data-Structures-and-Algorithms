package LinkedList.SinglyLinkedList.Operations.Deletion;

public class FromEnd {


    static void removeFromEnd(Node head){

        if(head==null){
            System.out.println("List is empty");
            return;
        }

        Node temp=head;
        while(temp.next.next!=null){
          temp=temp.next;
        }

        temp.next=null;
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

        removeFromEnd(head);

        System.out.println("Linked List after Deletion: ");
        display(head);

    }

}
