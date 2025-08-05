package LinkedList.DoublyLinkedList.Operations.Insertion;

public class InsertAtEnd {

    static Node InsertAtEndFun(Node head, int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=newNode;
        newNode.prev=temp;

        return head;
    }
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

    public static void main(String[] args) {
        Node head=new Node(10);
        head.next=new Node(20,null,head);
        head.next.next=new Node(30,null,head.next);
        head.next.next.next=new Node(40,null,head.next.next);
        head.next.next.next.next=new Node(50,null,head.next.next.next);

        System.out.println("Before Insertion: ");
        displayDLL(head);

        head=InsertAtEndFun(head,5);

        System.out.println("After Insertion: ");
        displayDLL(head);

    }
}
