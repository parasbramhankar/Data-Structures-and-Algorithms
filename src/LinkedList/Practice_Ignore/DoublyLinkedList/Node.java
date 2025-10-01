package LinkedList.Practice_Ignore.DoublyLinkedList;

class Node {
    Node next;
    Node prev;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
