package Stack.ImplementTheMinStack;

import java.util.Scanner;
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack;
    Stack<Integer>minStack;

    MinStack(){
        stack=new Stack<>();
        minStack=new Stack<>();
    }

    void push(int x){
        stack.push(x);

        if(minStack.isEmpty() || x<=minStack.peek()){
            minStack.push(x);
        }
    }

    void pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        int ele=stack.pop();

        if(!minStack.isEmpty() && ele==minStack.peek()){
            minStack.pop();
        }
    }

    int top(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return stack.peek();
    }

    boolean isEmpty(){

        return (stack.size()==0);
    }

    int getMin(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }

        return minStack.peek();
    }

    void display(){
        System.out.println("Original stack"+ stack.toString());
        System.out.println("MinStack: "+minStack.toString());
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        MinStack minSt=new MinStack();


        System.out.println("Push Operations: \nEnter the value: ");
        int ele=scanner.nextInt();
        minSt.push(ele);
        ele=scanner.nextInt();
        minSt.push(ele);
        ele=scanner.nextInt();
        minSt.push(ele);
        ele=scanner.nextInt();
        minSt.push(ele);
        //Display stack &  min Stack
        minSt.display();

        //top element
        System.out.println("Top Element: "+minSt.top());
        //Min Element
        System.out.println("Minimum Element: "+minSt.getMin());

       //pop Operation
        System.out.println("POP operation");
        minSt.pop();
        minSt.pop();

        //Display stack &  min Stack
        minSt.display();

        //top element
        System.out.println("Top Element: "+minSt.top());
        //Min element
        System.out.println("Minimum Element: "+minSt.getMin());

        scanner.close();
    }

}
