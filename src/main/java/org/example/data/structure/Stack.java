package org.example.data.structure;

public class Stack {
   static class Node
   {
       int data;
       Node next;
       Node(int data){
           this.data=data;
           next=null;
       }
   }
   Node head=null;

   public boolean isEmpty(){
       return head==null;
   }
   public void push(int data){
       Node newNode=new Node(data);
       if(isEmpty()){
           head=newNode;
           return;
       }else{
           newNode.next=head;
           head=newNode;
       }
   }

   public int pop(){
       if(isEmpty()){
           return -1;
       }else{
           Node top=head;
           head=head.next;
           return top.data;
       }
   }

    public int peek(){
        if(isEmpty()){
            return -1;
        }else{
            Node top=head;
            return top.data;
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
