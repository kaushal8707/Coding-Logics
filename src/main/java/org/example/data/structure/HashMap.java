package org.example.data.structure;
import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K,V>
{
  class Node{
      K key;
      V value;
      Node(K key, V value){
          this.key=key;
          this.value=value;
      }
  }

    int n; // no. of nodes
    int N; // no. of buckets;
    LinkedList<Node> buckets[];   //N - buckets length
    HashMap(){
      N=4;
      buckets=new LinkedList[N];
      for(int i=0;i<N;i++){
          buckets[i]=new LinkedList<>();
      }
    }

    public int hashfunction(K key){    //bi-bucket index
        int hashValue=key.hashCode();
        return Math.abs(hashValue)%N;
    }

    public int searchInAll(K key, int bi){
        LinkedList<Node> ll=buckets[bi];
        for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(key==node.key){
                return i;             // di-data Index
            }
        }
        return -1;
    }

    public void put(K key, V value){
        int bi=hashfunction(key);
        int di=searchInAll(key,bi);
        if(di==-1) {                //if di == -1 key not exists
            buckets[bi].add(new Node(key,value));
            n++;
        }else{
           LinkedList<Node> ll= buckets[bi];      // key exists
           Node node=ll.get(di);
           value=node.value;
        }
    }

    public boolean containsKey(K key){
        int bi=hashfunction(key);
        int di=searchInAll(key,bi);
        if(di==-1)
            return false;
        else
            return true;
    }

    public V remove(K key){
        int bi=hashfunction(key);
        int di=searchInAll(key,bi);
        if(di==-1){
            return null;      // key not exists
        }else{
            Node node=buckets[bi].remove(di);
            n--;
            return node.value;
        }
    }

    public V get(K key){
        int bi=hashfunction(key);
        int di=searchInAll(key,bi);
        if(di==-1){
            return null;      // key not exists
        }else{
            Node node=buckets[bi].get(di);
            return node.value;
        }
    }

    public ArrayList<K> keySet(){
       ArrayList<K> keyset=new ArrayList<>();
       for(int i=0;i<buckets.length;i++){
           LinkedList<Node> ll=buckets[i];
           for(int j=0;j<ll.size();j++){
               K key=ll.get(j).key;
               keyset.add(key);
           }
       }
       return keyset;
    }

    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("a",71);
        map.put("b",46);
        map.put("c",32);
        map.put("d",98);
        System.out.println("==================== get() ====================");
        System.out.println(map.get("b"));
        System.out.println("==================== remove () ================");
        System.out.println(map.remove("a"));
        System.out.println("==================== containsKey() ============");
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsKey("b"));
        System.out.println("==================== keySet() =================");
        ArrayList arl=map.keySet();
        for(Object d: arl){
            System.out.println(d+"=="+map.get(d));
        }
    }
}
