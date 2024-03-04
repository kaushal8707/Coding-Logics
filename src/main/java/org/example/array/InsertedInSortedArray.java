package org.example.array;

public class InsertedInSortedArray {
    public static void main(String[] args) {
        int arr[]= {2,5,18,20,29,32,40};
        int newArray[]=new int[arr.length+1];
        int x=23;
        int position=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                newArray[i]=arr[i];
                position++;
            }else{
                newArray[i+1]=arr[i];
            }
        }
        newArray[position]=x;
        for(int j:newArray){
            System.out.print(j+"  ");
        }
    }
}
