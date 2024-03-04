package org.example.array;

public class MinAndMaxInArray {
    public static void main(String[] args) {
        int arr[]= {5,8,3,9,6,2,10,7,-1,4};
        int min=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);

    }
}
