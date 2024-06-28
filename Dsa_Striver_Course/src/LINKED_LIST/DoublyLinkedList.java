package LINKED_LIST;

import java.util.Scanner;

public class DoublyLinkedList {

    DoublyLinkedList(){
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        DoubleNode head = arrayToLinkedList(arr);
        System.out.print("TRAVERSE IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
        int length=lengthOfLinkedList(head);
        System.out.println("LENGTH : "+length);
        head=deleteHead(head);
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
        System.out.print("Enter a value to Insert Between : ");
        int valueT0InsertAtBetween = in.nextInt();
        System.out.print("Enter a position to Insert : ");
        int positionToInsertBetween = in.nextInt();
        head=insertBetween(head,positionToInsertBetween,valueT0InsertAtBetween);
        System.out.print("AFTER INSERTION IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
    }

    public static DoubleNode arrayToLinkedList(int[] arr) {
        DoubleNode head = new DoubleNode(arr[0]);
        DoubleNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            DoubleNode temp = new DoubleNode(arr[i]);
            mover.next = temp;
            temp.prev=mover;
            mover = temp;
        }
        return head;
    }

    public static void traverseLinkedList(DoubleNode head){
        DoubleNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private static int lengthOfLinkedList(DoubleNode head){
        DoubleNode temp=head;
        int length=0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    private static DoubleNode deleteHead(DoubleNode head){
        if(head == null) {
            return head;
        }
        head=head.next;
        head.prev=null;
        return head;
    }

    private static DoubleNode deleteTail(DoubleNode head){
        if(head == null) {
            return head;
        }
        DoubleNode temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    private static DoubleNode deleteNodeByPosition(DoubleNode head, int position) {
        if(head == null) {
            return head;
        }
        if(position==0){
            head=head.next;
            head.prev=null;
            return head;
        }
        DoubleNode temp=head;
        int count=0;
        while(temp!=null){
            if(count==position){
                if(temp.next==null){
                    temp.prev.next=null;
                    break;
                }
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

    private static DoubleNode deleteNodeByValue(DoubleNode head, int value){
        if(head==null){
            return head;
        }
        if(head.data==value){
            head=head.next;
            return head;
        }
        DoubleNode temp=head;
        while(temp!=null){
            if(temp.data==value){
                if(temp.next==null){
                    temp.prev.next=null;
                    break;
                }
                temp.next.prev=temp.prev;
                temp.prev.next=temp.next;
                break;
            }
            temp=temp.next;
        }
        return head;
    }

    private static DoubleNode insertHead(DoubleNode head, int data){
        if(head==null){
            return head;
        }
        DoubleNode newHead = new DoubleNode(data);
        newHead.next=head;
        head.prev=newHead;
        return newHead;
    }

    private static DoubleNode insertTail(DoubleNode head, int data){
        if(head==null){
            return head;
        }
        DoubleNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        DoubleNode newTail = new DoubleNode(data);
        temp.next=newTail;
        newTail.prev=temp;
        return head;
    }

    private static DoubleNode insertBetween(DoubleNode head, int insertAt, int data){
        if(head==null){
            return head;
        }
        if(insertAt==0){
            DoubleNode newHead = new DoubleNode(data);
            newHead.next=head;
            head.prev=newHead;
            return newHead;
        }
        int count=0;
        DoubleNode temp=head;
        while(temp!=null){
            if(count==insertAt){
                DoubleNode newDoubleNode = new DoubleNode(data);
                if(temp.next==null){
                    newDoubleNode.prev=temp;
                    temp.next=newDoubleNode;
                    break;
                }
                temp.prev.next=newDoubleNode;
                newDoubleNode.prev=temp.prev;
                newDoubleNode.next=temp;
                temp.prev= newDoubleNode;
                break;
            }
            count++;
            temp=temp.next;
        }
        return head;
    }

}
