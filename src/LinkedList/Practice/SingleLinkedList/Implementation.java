package LinkedList.Practice.SingleLinkedList;

public class Implementation {

    //Inserting Through Array: Considering the List in fully empty

    Node insertThroughArray(int[]arr){
        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }

        return head;

    }

    static void displayList(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        int []arr=new int[]{10,20,30,40,50,60};
        Implementation implementation=new Implementation();

        Node head=implementation.insertThroughArray(arr);

        displayList(head);

    }
}
