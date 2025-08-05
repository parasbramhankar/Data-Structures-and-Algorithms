package LinkedList.DoublyLinkedList.Operations.ReverseDLL;



public class Reverse {

    static Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node curr=head;
        Node back=null;

        while(curr!=null){
            back=curr.prev;
            curr.prev=curr.next;
            curr.next=back;
            curr=curr.prev;
        }

        return back.prev;

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

        head=reverseList(head);

        System.out.println("After Insertion: ");
        displayDLL(head);

    }
}
