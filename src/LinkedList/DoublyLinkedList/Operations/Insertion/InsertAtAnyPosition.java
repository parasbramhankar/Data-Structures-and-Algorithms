package LinkedList.DoublyLinkedList.Operations.Insertion;

public class InsertAtAnyPosition {

    static Node InsertAtAnyPositionFun(Node head, int data, int pos){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return head;
        }

        Node temp=head;
        int count=0;

        while(temp!=null){
            count++;
            temp=temp.next;
        }

        if(count<pos){
            System.out.println("Position is not present");
            return null;
        }

        temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }

        newNode.next=temp.next;
        temp.next.prev=newNode;
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

        head=InsertAtAnyPositionFun(head,5,3);

        System.out.println("After Insertion: ");
        displayDLL(head);

    }

}