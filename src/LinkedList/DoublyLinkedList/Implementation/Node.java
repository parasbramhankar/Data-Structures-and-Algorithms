package LinkedList.DoublyLinkedList.Implementation;

public class Node {

    int data;
    Node next;
    Node prev;

    Node(int data,Node next,Node prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }

    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }

}
