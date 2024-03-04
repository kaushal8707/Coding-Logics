package org.example.sortings;
// number of passes should be n-1 = (5-1) = 4
// number of comparison should be reduced by 1 after each passes bcz the greatest elements will
// get sorted after each pass.....so, after 1 pass 1 element got sorted, after 2 pass 2 elements got sorted
// after 3 pass 3 elements got sorted.....

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]= {3,7,9,10,6,5,12,4,11,2};
        bubblesort(arr);
        for(int i : arr){
            System.out.print(i+" : ");
        }
    }

    private static void bubblesort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){    // number of pass = (n-1)=10-1=9
            for(int j=0;j<(arr.length-1-i);j++){  // number of max comparison (n-1-i) where i is the sortest in each passes
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
