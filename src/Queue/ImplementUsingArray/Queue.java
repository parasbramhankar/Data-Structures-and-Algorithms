package Queue.ImplementUsingArray;

import java.util.Scanner;

public class Queue {

    int front;
    int rear;
    int []arr;
    int capacity;

    Queue(int capacity){
        this.capacity=capacity;
        arr=new int[capacity];
        front=-1;
        rear=-1;
    }

    /*
    In a normal (linear) array queue, once rear reaches the end,
    you cannot insert — even if there is empty space at the beginning.
    Solution:

    void enqueue(int ele) {
        // full condition
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is full");
            return;
        }

        // first element
        if (front == -1) {
            front = 0;
        }

        rear = (rear + 1) % capacity;
        arr[r
     */

    void enQueue(int x){
        if(isFull()){
            System.out.println("Queue is already full");
            return;
        }
        if(front==-1 && rear==-1){
            front=0;
        }
        rear++;
        arr[rear]=x;
    }
    boolean isEmpty(){
        return (front == -1 || front > rear);
    }

    boolean isFull(){
        return (rear==capacity-1);
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Deletion not possible");
            return -1;  // Return special value to indicate failure.
        }
        int ele = arr[front];
        arr[front] = 0;
        front++;
        // Reset front and rear if queue is empty after dequeue
        if(front > rear){
            front = -1;
            rear = -1;
        }
        return ele;
    }

    int peek(){

        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the capacity of the the linked list: ");
        int capacity=scanner.nextInt();

        Queue queue=new Queue(capacity);

        System.out.println("Enter the number of elements: ");
        int noOfElement= scanner.nextInt();

        if(capacity<noOfElement){
            System.out.println("capacity is less than the number of elements you want to insert");
            System.exit(0);
        }

        for(int i=0;i<noOfElement;i++){
            queue.enQueue(scanner.nextInt());
        }

        //peek operation
        System.out.println("Front Element: "+queue.peek());

        // dequeue operations
        System.out.println("Dequeue: "+queue.deQueue());
        System.out.println("Dequeue: "+queue.deQueue());

        //peek operation
        System.out.println("Front Element: "+queue.peek());

        //isEmpty
        System.out.println("Is Empty: "+queue.isEmpty());

        //isFull
        System.out.println("Is Full"+queue.isFull());
    }
}