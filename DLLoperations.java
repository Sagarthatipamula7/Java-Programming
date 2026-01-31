import java.nio.channels.Pipe.SourceChannel;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DLLoperations {
    public static Node ConvertArrToDLL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            temp.prev=mover;
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
    public static Node DeleteAtFirst(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node back=head;
        head=head.next;
        head.prev=null;
        back.next=null;
        return head;
    }
    public static Node DeleteAtEnd(Node head){
        if(head==null || head.next==null){
            return null;
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        Node back=tail.prev;
        tail.prev=null;
        back.next=null;
        return head;
    }
    public static Node DeleteAtKpos(Node head,int k){
        if(head==null && k==1){
            return null;
        }
        if(k==1){
            return DeleteAtFirst(head);
        }
        int count=1;
        Node temp=head;
        while(temp!=null && count<k){
            count++;
            temp=temp.next;
        }
        Node back=temp.prev;
        Node front=temp.next;
        if(back==null){
            return DeleteAtFirst(head);
        }
        else if(front==null){
            return DeleteAtEnd(head);
        }
        else{
            back.next=front;
            front.prev=back;
            temp.next=null;
            temp.prev=null;
            return head;
        }
    }
    public static Node DeleteNode(Node node,Node head){
        Node back=node.prev;
        Node front=node.next;
        if(front==null){
            return DeleteAtEnd(head);
        }
        back.next=front;
        front.prev=back;
        node.next=null;
        node.prev=null;
        return head;
    }
    public static Node InsertAtFirst(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        return newNode;
    }
    public static Node InsertAtEnd(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node tail=head;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next=newNode;
        newNode.prev=tail;
        return head;
    }
    public static Node InsertAtkpos(Node head, int data, int k) {
        Node newNode = new Node(data);
        if (head == null && k == 1) {
            return newNode;
        }
        if (k == 1) {
            return InsertAtFirst(data, head);
        }
        int count = 1;
        Node temp = head;
        while (temp != null && count < k) {
            count++;
            temp = temp.next;
        }
        if (temp == null) {
            if (count == k) { // inserting at end
                return InsertAtEnd(data, head);
            }
            return head; // invalid k
        }
        Node back = temp.prev;
        newNode.next = temp;
        temp.prev = newNode;
        back.next = newNode;
        newNode.prev = back;
        return head;
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        Node head=ConvertArrToDLL(arr);
        head=DeleteAtFirst(head);
        head=DeleteAtEnd(head);
        head=DeleteAtKpos(head,5);
        head=DeleteNode(head.next.next.next,head);
        head=InsertAtFirst(1,head);
        head=InsertAtEnd(6,head);
        head=InsertAtkpos(head,5,5);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
