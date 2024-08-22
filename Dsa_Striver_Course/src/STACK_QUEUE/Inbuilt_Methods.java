package STACK_QUEUE;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Inbuilt_Methods {
    public static void main(String[] args) {
        //STACK
        System.out.println("STACK : ");
        Stack<Integer> myStack = new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());

        //QUEUE
        System.out.println("QUEUE : ");
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);
        myQueue.add(5);
        System.out.println(myQueue);
        System.out.println(myQueue.remove());
        System.out.println(myQueue);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.size());
    }
}
