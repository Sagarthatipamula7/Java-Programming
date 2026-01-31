
import java.util.*;

import javax.swing.SpinnerDateModel;

public class QueuesUsingStacks {
    Stack<Integer>st1=new Stack<>();
    Stack<Integer>st2=new Stack<>();
    public void enqueue(int x){
        while(!st1.isEmpty()){
            st2.push(st1.pop());
        }
        st1.push(x);
        while(!st2.isEmpty()){
            st1.push(st2.pop());
        }
        System.out.println(x+" is enqueued");
    }
    public void dequeue(){
        if(st1.isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(st1.pop()+" is dequeued");
    }
    public void peek(){
        if(st1.isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(st1.peek()+" is the peak element");
    }
    public void size(){
        if(st1.empty()){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(st1.size()+" is the size");
    }
    public static void main(String[] args) {
        QueuesUsingStacks q=new QueuesUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.dequeue();
        q.dequeue();
        q.peek();
        q.size();
    }
}

