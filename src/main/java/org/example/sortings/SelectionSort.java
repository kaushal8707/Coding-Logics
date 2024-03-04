package org.example.sortings;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]= {11,13,7,2,6,9,4,5,10,3};
        selectionsort(arr);
        for(int i:arr){
            System.out.print(i+" : ");
        }
    }

    private static void selectionsort(int[] arr) {
        int k;
        // for n we need n-1 passes and for each pass we need to select a particular position to insert
        //this for loop is for passes
        for(int i=0;i<arr.length-1;i++){
            //we need 2 pointer that also should start from o mean from i
            // j should scan the list of all the elements upto n to find out a smaller element
            // if any smaller element is found then k will brought to that location
            for(int j=k=i;j<arr.length;j++){
                if(arr[j]<arr[k])
                {
                    k=j;
                }
            }
            //once this above loop or scan is done k will be point to smallest element so we need to swap with
            // the position which is i so k and i need to swap
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
    }
}
