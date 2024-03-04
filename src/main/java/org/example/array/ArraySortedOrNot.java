package org.example.array;

public class ArraySortedOrNot {
    public static void main(String[] args) {
        int arr[]= {4,8,13,16,25,28,33};
        int i=0;
        boolean flag=false;
        while(i<arr.length-1){
            if(arr[i]>arr[i+1]){
                flag=true;
            }
            i++;
        }
        if(flag){
            System.out.println("Given array is not sorted");
        }else{
            System.out.println("Given array is sorted");
        }
    }
}
