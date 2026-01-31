class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class palindromell {
    public static Node convertArrayToLL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    } 
    public static Node reverse(Node head){
        Node prev=null;
        Node front=null;
        Node temp=head;
        while(temp!=null){
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        return prev;
    }
    public static boolean checkpalindrome(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node newHead=reverse(slow.next);
        Node temp=head;
        while(newHead!=null){
            if(temp.data!=newHead.data){
                return false;
            }
            newHead=newHead.next;
            temp=temp.next;
        }
        return true;
    }
    public static void main(String args[]){
        int arr[]={1,2,2,1};
        Node head=convertArrayToLL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        boolean flag=checkpalindrome(head);
        if(flag){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
