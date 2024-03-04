package org.example.array;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 9, 10, 40 };
        boolean flag=false;
        int min=0;
        int key=40;
        int max=arr.length-1;
        while(min<=max){
            int mid=(min+max)/2;
            if(key==arr[mid]){
                System.out.println(key+" found at position ="+(mid+1));
                flag=true;
                break;
            }else if(key>arr[mid]){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
        if(!flag){
            System.out.println(key+" not found");
        }
    }
}
