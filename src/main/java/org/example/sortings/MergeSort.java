package org.example.sortings;

public class MergeSort {
    public static void main(String[] args) {
        int arr[]= {3,7,9,10,6,5,12,4,11,2};
        int l=0;
        int r=arr.length-1;
        mergesort(arr,l,r);
        for(int i:arr){
            System.out.print(i+"-");
        }
    }

    private static void mergesort(int[] arr, int l, int r) {
        if(l<r){
            //find middle point
            int mid=(l+r)/2;
            // Sort first and second halves
            mergesort(arr,l,mid);
            mergesort(arr,mid+1,r);
            // Merge the sorted halves
            merge(arr,l,mid,r);
        }
    }

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    private static void merge(int[] arr, int l, int mid, int r) {
        // Find sizes of two subarrays to be merged
        int n1=mid-l+1;
        int n2=r-mid;
        /* Create temp arrays */
        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        /*Copy data to temp arrays*/
        for(int i=0;i<n1;i++){
            arr1[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            arr2[j]=arr[mid+1+j];
        }

        /* Merge the temp arrays */
        // Initial indexes of first and second subarrays
        int i=0;
        int j=0;
        // Initial index of merged subarray array
        int k=l;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of arr1[] if any */
        while(i<arr1.length){
                arr[k]=arr1[i];
                i++;
                k++;
            }
        /* Copy remaining elements of arr2[] if any */
        while(i<arr1.length){
            arr[k]=arr2[j];
            j++;
            k++;
        }


    }
}
