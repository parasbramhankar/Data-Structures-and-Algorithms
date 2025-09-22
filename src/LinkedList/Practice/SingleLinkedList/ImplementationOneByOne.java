package LinkedList.Practice.SingleLinkedList;

public class ImplementationOneByOne {

     void display(Node head){
         Node temp=head;

         while(temp!=null){
             System.out.print(temp.data);
             temp=temp.next;
             System.out.print("->");
         }
         System.out.print("null");
     }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next=new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
        head.next.next.next.next=new Node(50);
        head.next.next.next.next.next=new Node(60);
        ImplementationOneByOne implementationOneByOne=new ImplementationOneByOne();
        implementationOneByOne.display(head);
    }
}
