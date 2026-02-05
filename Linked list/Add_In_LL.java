



public class Add_In_LL {
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

    public void addFirst(int data){
        // step1 - create new node
        Node newNode = new Node(data);
        Size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }

        // step2 - newNode next =  head
        newNode.next=Head;

        // step3 - head =  newNode
        Head=newNode;

    }

    public void addLast(int data){
        Node newNode = new Node(data);
        Size++;
        if(Head==null){
            Head=Tail=newNode;
            return;
        }
        Tail.next=newNode;
        Tail=newNode;
    }
    public void p(){
        if(Head==null){
            System.out.println("LinkedList is Empty!!!");
        }
        Node temp = Head;
        while (temp!=null) { 
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx,int data){
        if (idx==0) {
            addFirst(data);
            return;
            
        }
        Node newNode = new Node(data);
        Size++;
        Node temp=Head;
        int i=0;

        while (i<idx-1) {
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

    }
    
    public int  removeFirst(){
        if (Size==0) {
            System.out.println("Linked List is Empty!!");
            return Integer.MIN_VALUE;
        }
        else if (Size==1) {
            int val = Head.data;
            Head=Tail=null;
            Size=0;
            return val;
        }
        int val = Head.data;
        Head=Head.next;
        Size--;
        return val;

    }
    
    public int removeLast(){
        if (Size==0) {
            System.out.println("LinkedList is Empty!!");
            return Integer.MIN_VALUE;
        }
        else if (Size==1) {
            int val =Head.data;
            Head=Tail=null;
            Size=0;
            return val;

        }

        // prev : i = size-2

        Node prev =Head;
        for(int i=0;i<Size-2;i++){
            prev=prev.next;
        }

        int val =prev.next.data;
        prev.next=null;
        Tail=prev;
        Size--;
        return val;
    }

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz=0;
        Node temp = Head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            Head=Head.next;
            return;
        }

        // size-n
        int i=1;
        int iTofind=sz-n;
        Node prev = Head;

        while(i<iTofind){
            prev=prev.next;
            i++;


        }

        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node Head){
        Node slow=Head;
        Node fast = Head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow; // midNode
    }

    public boolean checkPalindrome(){
        if(Head==null || Head.next==null){
            return true;
        }

        // Step1 - find midNode
        Node midNode = findMid(Head);

        // step2 - reverse 2nd half
        Node prev=null;
        Node curr=midNode;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right = prev;
        Node left =Head;

        // step3 - check if 1st half & 2nd half 
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Add_In_LL ll = new Add_In_LL();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(3);

        ll.p();
        System.out.println(ll.checkPalindrome());
        


    }
        

}
