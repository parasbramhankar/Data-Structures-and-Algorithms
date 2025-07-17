package LinkedList.SinglyLinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class Implementation {
    static Node head;

    static Node addDataInTheLinkedList(int[] data){
        if (data.length == 0) return null;

        // First node
        head = new Node(data[0]);
        Node temp = head;

        // Remaining nodes
        for (int i = 1; i < data.length; i++) {
            temp.next = new Node(data[i]);
            temp = temp.next;
        }

        return head;
    }

    static void displayList(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(); // Clean line after printing all elements
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of elements you want to insert into the linked list: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Node head = addDataInTheLinkedList(arr);

        System.out.println("The linked list: ");
        displayList(head);
    }
}
