public class Iterative_Search_LinkedList {
    public static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;


    public int  Iterative_Search(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }

        // key not found 
        return -1;



    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return  0;
        }
        int idx = helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;

    }

    public int recSearch(int key){
        return helper(head, key);
    }

    public void reverse(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head=prev;
    }

    public static void main(String[] args) {
        Iterative_Search_LinkedList ll = new Iterative_Search_LinkedList();
        

        System.out.println(ll.recSearch(2));
    }
}
