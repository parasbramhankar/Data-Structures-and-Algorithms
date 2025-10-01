package LinkedList.Practice_Ignore.DoublyLinkedList;


public class Implementation {

    public static Node addIntoTheList(int[]arr ) {
        Node head=new Node(arr[0]);

        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i],null,temp);
            temp.next=newNode;
            temp=temp.next;
        }

        return head;
    }
    static void display(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    static Node getTailNode(Node head){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        return temp;
    }

    public static void displayBack(Node tail){
        while(tail!=null){
            System.out.print(tail.data+"->");
            tail=tail.prev;
        }

        System.out.print("null");
    }

    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60,70};


        System.out.println("\nFront Traversal:");
        Node head=addIntoTheList(arr);
        display(head);

        System.out.println("\nBack Traversal:");
        Node tail=getTailNode(head);
        displayBack(tail);
    }
}