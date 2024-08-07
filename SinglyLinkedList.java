public class SinglyLinkedList {
    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data=data;
            this.next=null;
        }
    }
    public void display() { //display() function print the elements of sll
        ListNode current=head; //current=10, 1, 8, 11, null
        while(current!=null) { //10!=null(true), 1!=null(true), 8!=null(t), 11!=null(t), null!=null(f)
            System.out.print(current.data+"-> "); //10->1->8->11
            current=current.next; //current=1, 8, 11, null
        }
        System.out.println("null");//null
    }
    public int length() { //length of a sll
        if(head==null) {
            return 0;
        }
        int count=0;
        ListNode current=head; //current=10, 1, 8, 11, null
        while(current!=null) { //10(t), 1(t), 8(t), 11(t), null(f) 
            count++; //count=0, 1, 2, 3, 4 
            current=current.next; // current=1, 8, 11
        }
        return count; //4
    }
    public void insertNodeFirst(int value){ //insert node at the beginning
        ListNode newNode=new ListNode(value); //9(newNode, null)
        newNode.next=head; //9(newNode)-> head(10)
        head=newNode; //9(newNode,head)
    }
    public void insertNodeLast(int value) { //insert node at the end
        ListNode newNode=new ListNode(value); //13
        if(head==null) { //false
            head=newNode;
            return;
        } 
        ListNode current=head; //current=7, 9, 10, 1, 8, 11, 12
        while(null!=current.next) { //7!=9(t), 9(t), 10(t), 1(t), 8(t), 11(t), 12(f)
            current=current.next;//current=9, 10, 1, 8, 11
        }
        current.next=newNode;//12->13
}
    public static void main(String[] args) {
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.head=new ListNode(10); // add nodes with head and null pointer
        ListNode second=new ListNode(1); // add nodes with head and null pointer
        ListNode third=new ListNode(8); // add nodes with head and null pointer
        ListNode fourth=new ListNode(11); // add nodes with head and null pointer
        sll.head.next=second; //10->1
        second.next=third; //10->1->8
        third.next=fourth; //10->1->8->11->null(chaining)
        sll.display();// 10->1->8->11->null(printing)
        System.out.println("Length of sll is: "+sll.length()); //4(length of sll)
        sll.insertNodeFirst(9);
        sll.insertNodeFirst(7);
        System.out.println("After inserting new node at the beginning sll is: ");
        sll.display();
        System.out.println("After inserting new node at the beginning, length of sll is: "+sll.length());
        sll.insertNodeLast(12);
        sll.insertNodeLast(13);
        System.out.println("After inserting new node at the end sll is: ");
        sll.display();
        System.out.println("After inserting new node at the end, length of sll is: "+sll.length());
    }
}
