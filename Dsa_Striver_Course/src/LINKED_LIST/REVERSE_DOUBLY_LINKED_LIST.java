package LINKED_LIST;

public class REVERSE_DOUBLY_LINKED_LIST {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        DoubleNode head = DoublyLinkedList.arrayToLinkedList(arr);
        System.out.print("TRAVERSE IN LINKED LIST : ");
        DoublyLinkedList.traverseLinkedList(head);
        System.out.println();
        System.out.println("AFTER REVERSING OF LINKED LIST : ");
        head=reverseDoublyLinkedList(head);
        DoublyLinkedList.traverseLinkedList(head);
        System.out.println();
    }

    private static DoubleNode reverseDoublyLinkedList(DoubleNode head){
        if(head==null){
            return head;
        }
        DoubleNode temp=head;
        DoubleNode back=null;
        while(temp!=null){
            back=temp.prev;
            temp.prev=temp.next;
            temp.next=back;
            temp=temp.prev;
        }
        return back.prev;
    }
}
