package org.example.array;

public class ShiftEvenLeftOddRightSideInArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int array[]=new int[arr.length];
        int j=0;
        int k=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                array[j]=arr[i];
                j++;
            }else{
                array[k]=arr[i];
                k--;
            }
        }
        for(int m:array){
            System.out.print(m+"   ");
        }
    }

}
