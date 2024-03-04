package org.example.array;

public class MissingInUnSorted {
    public static void main(String[] args) {
        int arr[]= {3,7,4,9,6,1,11,2,10};
        int max=12;
        int newArray[]=new int[max];
        for(int i=0;i<arr.length;i++){
            newArray[arr[i]]++;
        }

        for(int i=0;i<newArray.length;i++){
            if(newArray[i]==0){
                System.out.print(i+" ");
            }
        }
    }
}
