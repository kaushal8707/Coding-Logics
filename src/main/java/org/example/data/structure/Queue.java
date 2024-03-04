package org.example.data.structure;

public class Queue {
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
    Node tail=null;
    public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void add(int data){
        Node newNode=new Node(data);
        if(isEmpty()){
            head=tail=newNode;
            return;
        }else{
            tail.next=newNode;
            tail=newNode;
        }
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty.....");
            return -1;
        }
        if(head==tail){
            tail=null;
        }
        Node front=head;
        head=head.next;
        return front.data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty.....");
            return -1;
        }
        Node front=head;
        return front.data;
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        queue.add(15);
        queue.remove();

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
