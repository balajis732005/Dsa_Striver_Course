package LINKED_LIST;

public class DoubleNode {

    DoubleNode prev;
    int data;
    DoubleNode next;

    DoubleNode(int data){
        this.data=data;
    }

    DoubleNode(DoubleNode prev,int data,DoubleNode next){
        this.prev=prev;
        this.data=data;
        this.next=next;
    }

}
