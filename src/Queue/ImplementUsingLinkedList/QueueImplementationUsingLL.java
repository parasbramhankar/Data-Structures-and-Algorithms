package Queue.ImplementUsingLinkedList;




class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class QueueImplementationUsingLL {
    Node front;
    Node rare;

    void push(int data){
        Node newNode =new Node(data);
        if(front==null && rare==null){
            front=rare=newNode;
            return;
        }

        rare.next=newNode;
        rare=newNode;

    }

    int pop(){
        if(isEmpty()){
            System.out.println("This Queue is empty");
            return -1;
        }
        int data= front.data;
        front=front.next;

        return data;
    }

    boolean isEmpty(){
        return (front==null) && (rare==null);
    }

    int peek(){
        if(isEmpty()){
            System.out.println( "Queue is empty");
            return -1;
        }
        return front.data;

    }

    void display(){
        Node temp=front;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        QueueImplementationUsingLL queueImplementationUsingLL=new QueueImplementationUsingLL();


        System.out.println("Push  Operations: ");
        queueImplementationUsingLL.push(10);
        queueImplementationUsingLL.push(20);
        queueImplementationUsingLL.push(30);
        queueImplementationUsingLL.push(40);
        queueImplementationUsingLL.push(50);


        System.out.println("Queue become: ");
        queueImplementationUsingLL.display();

        System.out.println("Pop  Operations: ");
        queueImplementationUsingLL.pop();
        queueImplementationUsingLL.pop();

        System.out.println("Queue become: ");
        queueImplementationUsingLL.display();

        System.out.println("Is Queue empty: "+queueImplementationUsingLL.isEmpty());

        System.out.println("Peek element: "+queueImplementationUsingLL.peek());

        System.out.println("Push Operations: ");
        queueImplementationUsingLL.push(90);
        queueImplementationUsingLL.push(100);


        System.out.println("Final Queue: ");
        queueImplementationUsingLL.display();


    }
}
