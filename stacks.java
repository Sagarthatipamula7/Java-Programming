class Mystack{
    int capacity;
    int stackarr[];
    int top;
    Mystack(int size){
        capacity=size;
        stackarr=new int[capacity];
        top=-1;
    } 
    public void push(int x){
        if(top==capacity-1){
            System.out.println("Stack Overflow");
            return;
        }
        stackarr[++top]=x;
        System.out.println(stackarr[top]+"   is pushed");
    }
    public void pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return;
        }
        System.out.println(stackarr[top]+"  is poped");
        top=top-1;
    } 
    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
            return 0;
        }
        return stackarr[top];
    }
    public int  size(){
        if(top==-1){
            System.out.println("Stack is empty");
            return 0;
        }
        return top+1;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean ifFull(){
        return top==capacity-1;
    }
    public static void main(String args[]){
        Mystack st=new Mystack(5);
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.pop();
        st.pop();
        st.peek();
        st.size();
        System.out.println(st.ifFull());
        System.out.println(st.isEmpty());
        while(!st.isEmpty()){
            System.out.print(st.peek());
            st.pop();
        }
    }
}