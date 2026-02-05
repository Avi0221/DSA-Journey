public class Remove_cycle_LL {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public static Node Head;
    public static Node Tail;
    public static int  Size;

    public static boolean isCycle(){
        Node slow = Head;
        Node fast = Head;

        while(fast!=null || fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = Head;
        Node fast = Head;
        boolean cycle = false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                cycle=true;
                break;

            }
        }

        if(cycle==false){
            return;
        }

        // find meeting point
        slow=Head;
        Node prev = null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;

        }

        // remove cycle

        prev.next=null;

    }

    public static void main(String[] args) {
        Head=new Node(1);
        Node temp = new Node(2);
    
        Head.next=temp;
        Head.next.next=new Node(3);
        Head.next.next.next=temp;

        System.out.println(isCycle());
        removeCycle();
        System.out.println(isCycle());
    }

}
