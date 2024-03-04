package org.example.array;

public class MultipleMissingInSortedArray {
    public static void main(String[] args) {
        int arr[]= {6,7,8,9,11,12,15,16,17,18,19};
        int diff=arr[0]-0;
        for(int i=0;i<arr.length;i++){
                while(diff<arr[i]-i){
                    System.out.println(diff+i);
                    diff++;
                }
        }
    }
}
