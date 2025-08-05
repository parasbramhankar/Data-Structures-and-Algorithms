package LinkedList.DoublyLinkedList.Operations.Insertion;

public class InsertAtBeginning {

    static Node InsertAtBeginningFun(Node head, int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }
        newNode.next=head;
        head.prev=newNode;

        head=newNode;

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

        head=InsertAtBeginningFun(head,5);

        System.out.println("After Insertion: ");
        displayDLL(head);

    }
}
