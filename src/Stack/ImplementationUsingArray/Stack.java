package Stack.ImplementationUsingArray;

import java.util.Scanner;

public class Stack {
    int capacity;
    int []arr;
    int top;

    Stack(int capacity){
        this.capacity=(capacity+1);
        arr=new int[capacity];
        top=-1;
    }

    void push(int x){
        if(top==capacity){
            System.out.println("Stack is full");
            return;
        }
        top++;
        arr[top]=x;
    }

// pop: Remove the element & display that element
    int pop(){
        if(top==-1){
            System.out.println("Stack is already empty");
            return -1;
        }
        int element=arr[top];
        arr[top]=0;
        top--;
        return element;
    }


    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];

    }

    boolean isEmpty(){
        return top==-1;
    }



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the capacity of the stack");
        int size=scanner.nextInt();
        Stack stack=new Stack(size);

        System.out.println("Enter the number of values do you want to insert into the stack: ");
        int n=scanner.nextInt();

        if(n>stack.capacity){
            System.out.println("Capacity is less that the number of elements you want to insert");
            System.exit(0);
        }

// Push operation
        for(int i=0;i<n;i++){
            stack.push(scanner.nextInt());
        }

//Pop operation
        System.out.println("Pop :"+stack.pop());
        System.out.println("Pop :"+stack.pop());
        System.out.println("Pop :"+stack.pop());

//Peek Operation
        System.out.println("Top element: "+stack.peek());
//Pop operation
        System.out.println("Pop :"+stack.pop());
//push Operation: Inserting the 10
        stack.push(100);

//Displaying all the values which are into the stack
      System.out.print("Displaying list: ");
      while(stack.top!=-1){
          System.out.print(stack.pop()+",");
      }

    }
}
