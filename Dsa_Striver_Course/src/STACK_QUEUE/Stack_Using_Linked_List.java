package STACK_QUEUE;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
    }
}

public class Stack_Using_Linked_List {

    private static Node top = null;
    private static int size=0;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(top());
        System.out.println(size());
        System.out.println(pop());
        System.out.println(top());
        System.out.println(size());
    }
    static void push(int data) {
        Node newData = new Node(data);
        newData.next=top;
        top=newData;
        size++;
    }
    static int pop(){
        int popData=top.data;
        top=top.next;
        size--;
        return popData;
    }
    static int size(){
        return size;
    }
    static int top(){
        return top.data;
    }
}
