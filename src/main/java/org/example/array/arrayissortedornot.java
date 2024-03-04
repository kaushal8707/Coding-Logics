package org.example.array;

public class arrayissortedornot {
    public static void main(String[] args) {
        int arr[]= {4,8,13,16,22,25,28,33};
        boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("Not sorted");
        }else{
            System.out.println("sorted");
        }
    }
}
