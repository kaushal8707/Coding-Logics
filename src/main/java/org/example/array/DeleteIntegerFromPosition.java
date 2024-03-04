package org.example.array;

public class DeleteIntegerFromPosition {
    public static void main(String[] args) {
        int arr[]= {5,2,9,3,6,4,1,8,7};
        int dPosition=4;
        int newArray[]=new int[arr.length-1];
        for(int i=0;i<arr.length;i++){
            if(i<dPosition-1){
                newArray[i]=arr[i];
            }
            if(i>dPosition-1){
                newArray[i-1]=arr[i];
            }
        }

        for(int k:newArray){
            System.out.println(k);
        }
    }
}
