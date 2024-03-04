package org.example.array;

public class Concatnat2SortedInOneSorted {
    public static void main(String[] args) {
        int arr1[] = { 6, 7, 8, 9, 10 };
        int arr2[] = { 1, 2, 3, 4 };
        int arr[]=new int[arr1.length+arr2.length];
        int i=0;int j=0;int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[i]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr[k]=arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr[k]=arr2[j];
            j++;
            k++;
        }
        System.out.println("=========================");
        for(int l:arr){
            System.out.println(l);
        }
    }
}
