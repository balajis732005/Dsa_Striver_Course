package LINKED_LIST;

import java.util.Scanner;

public class SinglyLinkedList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {5,4,2,1};
        SingleNode head = arrayToLinkedList(arr);
        System.out.print("TRAVERSE IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        int length=lengthOfLinkedList(head);
        System.out.println("LENGTH : "+length);
        head=halfReverse(head);
        System.out.print("TRAVERSE IN LINKED LIST : ");
        traverseLinkedList(head);
        head=deleteHead(head);
        System.out.println();
        System.out.print("HEAD DELETED IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        head=deleteTail(head);
        System.out.print("TAIL DELETED IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        System.out.print("Enter a position to Delete : ");
        int positionToDelete = in.nextInt();
        head=deleteNodeByPosition(head,positionToDelete);
        System.out.print("AFTER DELETION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        System.out.print("Enter a value to Delete : ");
        int valueToDelete = in.nextInt();
        head=deleteNodeByValue(head,valueToDelete);
        System.out.print("AFTER DELETION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        System.out.print("Enter a value to Insert At Head : ");
        int valueT0InsertAtHead = in.nextInt();
        head=insertHead(head,valueT0InsertAtHead);
        System.out.print("AFTER INSERTION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        System.out.print("Enter a value to Insert At Tail : ");
        int valueT0InsertAtTail = in.nextInt();
        head=insertTail(head,valueT0InsertAtTail);
        System.out.print("AFTER INSERTION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        System.out.print("Enter a value to Insert Between: ");
        int valueT0InsertAtBetween = in.nextInt();
        System.out.print("Enter a position to Insert : ");
        int positionToInsertBetween = in.nextInt();
        head=insertBetween(head,positionToInsertBetween,valueT0InsertAtBetween);
        System.out.print("AFTER INSERTION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
    }

    private static SingleNode arrayToLinkedList(int[] arr) {
        SingleNode head = new SingleNode(arr[0]);
        SingleNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            SingleNode temp = new SingleNode(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void traverseLinkedList(SingleNode head){
        SingleNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private static int lengthOfLinkedList(SingleNode head){
        SingleNode temp=head;
        int length=0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    private static SingleNode deleteHead(SingleNode head){
        if(head == null) {
            return head;
        }
        head=head.next;
        return head;
    }

    private static SingleNode deleteTail(SingleNode head){
        if(head == null) {
            return head;
        }
        SingleNode temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static SingleNode deleteNodeByPosition(SingleNode head, int position) {
        if(head == null) {
            return head;
        }
        if(position==0){
            head=head.next;
            return head;
        }
        SingleNode temp=head;
        int count=0;
        while(temp!=null){
            if(count==position-1){
                temp.next=temp.next.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

    private static SingleNode deleteNodeByValue(SingleNode head, int value){
        if(head==null){
            return head;
        }
        if(head.data==value){
            head=head.next;
            return head;
        }
        SingleNode temp=head;
        while(temp!=null){
            if(temp.next.data==value){
                temp.next=temp.next.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static SingleNode insertHead(SingleNode head, int data){
        if(head==null){
            return head;
        }
        SingleNode newHead = new SingleNode(data);
        newHead.next=head;
        return newHead;
    }

    private static SingleNode insertTail(SingleNode head, int data){
        if(head==null){
            return head;
        }
        SingleNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        SingleNode newTail = new SingleNode(data);
        temp.next=newTail;
        return head;
    }

    private static SingleNode insertBetween(SingleNode head, int insertAt, int data){
        if(head==null){
            return head;
        }
        if(insertAt==0){
            SingleNode newHead = new SingleNode(data);
            newHead.next=head;
            return newHead;
        }
        int count=0;
        SingleNode temp=head;
        while(temp!=null){
            if(count==insertAt-1){
                SingleNode newSingleNode = new SingleNode(data);
                newSingleNode.next=temp.next;
                temp.next= newSingleNode;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

    private static SingleNode halfReverse(SingleNode head) {
        SingleNode temp=head;
        int length=0;
        while(temp!=null){
            length++;
            temp=temp.next;
        }
        SingleNode mid=head;
        SingleNode prevmid=null;
        int count=0;
        while(count<(length/2)){
            if(count==(length/2)-1){
                prevmid=mid;
            }
            mid=mid.next;
            count++;
        }
        System.out.println(mid.data);
        System.out.println("p:"+prevmid.data);
        SingleNode one=mid;
        SingleNode two=mid.next;
        while(two!=null){
            SingleNode three=two.next;
            two.next=one;
            one=two;
            two=three;
        }
        System.out.println(one.data);
        prevmid.next=one;
        mid.next=null;
        return head;
    }

}
