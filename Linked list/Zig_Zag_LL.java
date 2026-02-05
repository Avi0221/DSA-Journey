public class Zig_Zag_LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int  size;

    public void ZigZag(){
        // Find Mid
        Node slow=head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr=mid.next;
        mid.next=null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right = prev;
        Node nextL,nextR;

        // alternate merging
        while(left!=null && right!=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
}
