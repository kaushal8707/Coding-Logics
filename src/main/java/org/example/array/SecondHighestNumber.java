package org.example.array;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int arr[]= {5,8,3,9,6,2,10,7,-1,4};
        int max=0;
        int secondMax=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax){
                secondMax=arr[i];
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Second Max = "+secondMax);
    }
}
