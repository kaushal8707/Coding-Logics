package org.example.array;

public class ConcatnatArray {
    public static void main(String[] args) {
        int arr1[] = { 6, 7, 8, 9, 10 };
        int arr2[] = { 1, 2, 3, 4, 5 };
        int counter=0;
        int arr[]=new int[arr1.length+arr2.length];
        for(int i=0;i<arr1.length;i++){
            arr[i]=arr1[i];
            counter++;
        }
        for(int i=0;i<arr2.length;i++){
            arr[counter]=arr2[i];
            counter++;
        }

        System.out.println("==========================");
        for(int k:arr){
            System.out.println(k);
        }
    }
}
