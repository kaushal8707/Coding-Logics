package org.example.data.structure;

class Node
{
    int data;
    Node next;
}
public class LinkedList
{
   Node head;
   public void insert(int data){      //always insert at last
       Node node=new Node();
       node.data=data;
       node.next=null;
       if(head==null){
           head=node;
       }else{
           Node temp=head;
           while(temp.next!=null){    // temp-> node for traversal
               temp=temp.next;
           }
           temp.next=node;

       }
   }
   public void insertAtFirst(int data){
       Node n=new Node();
       n.data=data;
       n.next=null;
       if(head==null){
           head=n;
       }else{
           n.next=head;
           head=n;
       }
   }
   //
   public void insertAtIndex(int index, int data){
       Node newNode=new Node();
       newNode.data=data;
       newNode.next=null;
       if(index==0){
           insertAtFirst(data);
       }else{
           Node temp=head;
           for(int i=0;i<index-1;i++){
               temp=temp.next;
           }
           newNode.next=temp.next;
           temp.next=newNode;
       }
   }

   // delete the node from the given Index
   public void delete(int index){
       if(index==0){
           head=head.next;
       }else{
           Node node=head;
           Node temp=null;
           for(int i=0;i<index-1;i++){
               node=node.next;
           }
           temp=node.next;
           node.next=temp.next;
           temp=null;
       }
   }

   // display all the nodes from the LinkedList
   public void show(){
       Node temp=head;
       while(temp.next!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }
       System.out.println(temp.data);
   }


    public static void main(String[] args) {
     LinkedList ll=new LinkedList();
     ll.insert(1);
     ll.insert(2);
     ll.insert(3);
     ll.insert(4);
     ll.insertAtFirst(5);
     ll.insertAtIndex(2,11);
     ll.delete(0);
     ll.delete(3);
     ll.show();
    }
}
