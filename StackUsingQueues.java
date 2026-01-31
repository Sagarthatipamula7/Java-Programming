import java.util.*;
public class StackUsingQueues {
    
    Queue<Integer>q=new LinkedList<>();
    public void push(int x){
        q.offer(x);
        for(int i=0;i<q.size()-1;i++){
            q.offer(q.poll());
        }
        System.out.println(x+" is pushed");
    }
    public void pop(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(q.poll()+" is popped");
    }
    public void peek(){
        if(q.isEmpty()){
            System.out.println("Stack is empty");
            return;
        }
        System.out.println(q.peek()+" is the peek element");
    }
    public void size(){
        if(q.isEmpty()){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(q.size()+" is the size of the stack");
    }
    public static void main(String[] args) {
        StackUsingQueues st=new StackUsingQueues();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.pop();
        st.pop();
        st.peek();
        st.push(5);
        st.peek();
    }
}
