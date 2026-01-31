

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ArraytoDLL {
    public static Node ConvertArrToDLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            temp.prev = prev;
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    public static Node  DeleteAtFirst(Node head){
        Node prev=head;
        if(head==null || head.next==null){
            return head;
        }
        head=head.next;
        head.prev=null;
        prev.next=null;
        return head;
    }
    public static Node DeleteAtEnd(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        Node next=temp.next;
        temp.next=null;
        next.prev=null;
        return head;
    }
    public static Node DeleteAtKpos(Node head,int k){
        if(head==null || head.next==null){
            return null;
        }
        int count=1;
        Node temp=head;
        while(temp!=null && count<k){
            count++;
            temp=temp.next;
        }
        if(temp==null)return head;
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
        }
        return head;
    }
    public static Node DeleteNode(Node temp,Node head){
        Node back=temp.prev;
        Node front=temp.next;
        if(front==null){
            back.next=null;
            temp.prev=null;
        }
        else{
            back.next=front;
            front.prev=back;
            temp.next=null;
            temp.prev=null;
        }
        return head;
    }
    public static Node InsertAtFirst(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return head;
    }
    public static Node InsertAtEnd(int data,Node head){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        return head;
    }
    public static Node insetAtEndBeforeTail(int data, Node head){
        Node newNode=new Node(data);
        if(head==null){
            return newNode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node tail=temp;
        Node back=tail.prev;
        newNode.next=tail;
        tail.prev=newNode;
        back.next=newNode;
        newNode.prev=back;
        return head;
    }
    public static Node InsertAtKpos(int data,int k,Node head){
        Node newNode=new Node(data);
        if(head==null && k==1){
            return newNode;
        }
        if(k==1){
            return InsertAtFirst(data, head);
        }
        int count=1;
        Node temp=head;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        if(temp==null){
            if(count==k-1){
                return InsertAtEnd(data, head);
            }
            return head;
        }
        Node back=temp.prev;
        newNode.next=temp;
        temp.prev=newNode;
        back.next=newNode;
        newNode.prev=back;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        Node head = ConvertArrToDLL(arr);
        head=DeleteAtFirst(head);
        head=DeleteAtEnd(head);
        head=DeleteAtKpos(head,4);
        head=DeleteNode(head.next.next,head);
        head=InsertAtFirst(1,head);
        head=InsertAtEnd(5,head);
        head=insetAtEndBeforeTail(4,head);
        head=InsertAtKpos(6,6,head);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

