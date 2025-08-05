package LinkedList.DoublyLinkedList.Operations.ReverseDLL;

public class UsingBackPointer {

    static Node reverseList(Node head){

        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
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

    //Print using the prev
    static void displayDLLUsingPrev(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.prev != null) System.out.print("->");
            temp = temp.prev;
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
        displayDLLUsingPrev(head);

    }

}
