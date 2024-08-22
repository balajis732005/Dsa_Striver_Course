package STACK_QUEUE;

class Node1 {
    int data;
    Node1 next;
    Node1(int data) {
        this.data = data;
    }
}

public class Queue_Using_Linked_List {

    private static Node1 start = null;
    private static Node1 end = null;
    private static int size = 0;

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
        Node1 newNode = new Node1(data);
        if(size==0) {
            start = newNode;
        }else{
            end.next = newNode;
        }
        end=newNode;
        size++;
    }
    static int pop() {
        int dequeueData = start.data;
        start=start.next;
        size--;
        return dequeueData;
    }
    static int top() {
        return start.data;
    }
    static int size(){
        return size;
    }
}
