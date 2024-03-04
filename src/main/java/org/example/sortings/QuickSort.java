package org.example.sortings;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]= {3,7,9,10,6,5,12,4,11,2};
        int l=0;
        int r=arr.length-1;
        quicksort(arr,l,r);
        for(int i:arr){
            System.out.print(i+"-");
        }
    }

    private static void quicksort(int[] arr, int l, int r) {
        if(l<r){
            int pi=dopartition(arr,l,r);
            quicksort(arr,l,pi-1);
            quicksort(arr,pi+1, r);
        }
    }

    private static int dopartition(int[] arr, int l, int r) {
            int pivot=arr[r];
            int i=l-1;
            for(int j=l;j<r;j++){
                if(arr[j]<pivot){
                    i++;
                    swapping(arr,i,j);
                }
            }
            swapping(arr,i+1, r);
            return (i+1);
    }

    private static void swapping(int[] arr, int i, int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
