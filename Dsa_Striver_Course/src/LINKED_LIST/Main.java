package LINKED_LIST;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        Node head = arrayToLinkedList(arr);
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
        System.out.print("TAIL IN LINKED LIST : ");
        traverseLinkedList(head);
        System.out.println();
    }

    private static Node arrayToLinkedList(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void traverseLinkedList(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private static int lengthOfLinkedList(Node head){
        Node temp=head;
        int length=0;
        while (temp!=null){
            length++;
            temp=temp.next;
        }
        return length;
    }

    private static Node deleteHead(Node head){
        if(head == null) {
            return head;
        }
        head=head.next;
        return head;
    }

    private static Node deleteTail(Node head){
        if(head == null) {
            return head;
        }
        Node temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

}
