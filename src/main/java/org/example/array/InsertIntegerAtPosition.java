package org.example.array;

public class InsertIntegerAtPosition {
    public static void main(String[] args) {
        int arr[]= {5,2,9,3,6,4,1,8,7};
        int newArray[]=new int[arr.length+1];
        int insertedPosition=4;
        int x=99;
        for(int i=0;i<arr.length;i++){
            if(i<insertedPosition-1){
                newArray[i]=arr[i];
            }else{
                newArray[i+1]=arr[i];
            }
        }
        newArray[insertedPosition-1]=x;
        for(int d:newArray){
            System.out.print(d+" ");
        }
    }
}
