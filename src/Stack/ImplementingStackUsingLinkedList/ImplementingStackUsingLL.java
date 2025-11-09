package Stack.ImplementingStackUsingLinkedList;


class Node{
    int data;
    Node next;

    Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}
public class ImplementingStackUsingLL {
    Node top;

    void push(int data){
        top= new Node(data,top);
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int value=top.data;
        top=top.next;
        return value;
    }

    boolean isEmpty(){
        return top==null;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }

        return top.data;
    }
    void displayStack(){
        Node temp=top;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ImplementingStackUsingLL implementingStackUsingLL=new ImplementingStackUsingLL();
        System.out.println("push Operation:");

        implementingStackUsingLL.push(1);
        implementingStackUsingLL.push(2);
        implementingStackUsingLL.push(3);
        implementingStackUsingLL.push(4);
        implementingStackUsingLL.push(5);

        System.out.print("stack become: ");
        implementingStackUsingLL.displayStack();

        System.out.println("Pop operation: ");
        implementingStackUsingLL.pop();
        implementingStackUsingLL.pop();

        System.out.print("stack become: ");
        implementingStackUsingLL.displayStack();

        System.out.println("push Operation:");
        implementingStackUsingLL.push(6);
        implementingStackUsingLL.push(7);
        System.out.print("stack become: ");
        implementingStackUsingLL.displayStack();

        System.out.println("Peek Element: "+implementingStackUsingLL.peek());

        System.out.println("Is stack empty: "+implementingStackUsingLL.isEmpty());

        System.out.println("Display Final Stack: ");
        implementingStackUsingLL.displayStack();
    }
}
