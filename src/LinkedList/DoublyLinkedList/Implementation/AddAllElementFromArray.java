package LinkedList.DoublyLinkedList.Implementation;

public class AddAllElementFromArray {



    static Node insertAllElement(int[]arr){
        Node head=new Node(arr[0]);

        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i],null,temp);

            temp.next=newNode;
            temp=newNode;
        }
        return head;
    }

    static void displayDLL(Node head){

        Node temp=head;

        while(temp.next!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print(temp.data);
    }
    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50};
        Node head=insertAllElement(arr);
        System.out.println("Doubly Linked List: ");
        displayDLL(head);
    }
}
