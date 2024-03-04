package org.example.array;

public class DuplicateInSortedArray {
    public static void main(String[] args) {
        int arr[]= {3,6,8,8,10,12,15,15,15,20};
        int lastIndex=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=lastIndex){
                System.out.println(arr[i]);
                lastIndex=arr[i];
            }
        }
    }
}
