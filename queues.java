import java.io.OutputStream;
import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

public class queues {
    int front;
    int rear;
    int queueArr[];
    int capacity;
    int length;
    queues(int size){
        capacity=size;
        queueArr=new int[capacity];
        front=0;
        rear=-1;
        =0;
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Queue Overflow");
            return;
        }
        rear=(rear+1)%capacity;
        queueArr[rear]=x;
        length++;
        System.out.println(x+" is enqueued");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println(queueArr[front]+" is dequeued");
        length--;
        front=(front+1)%capacity;
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        System.out.println(queueArr[front]);
    }
    public boolean isFull(){
        return (rear+1)%capacity==front;
    }
    public boolean isEmpty(){
        return front>rear;
    }
    public static void main(String args[]){
        queues q=new queues(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        q.dequeue();
        q.dequeue();
        q.peek();
        System.out.println(length);
    }
}
