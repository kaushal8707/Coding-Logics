package org.example;

public class Q3 {
    public static void main(String[] args) {
        int arr[] = {-4, -2, 3, 7, 5, 8, 6, 1};
        int maxNumberOfProducts=0;
        int minNumberOfProducts=0;
        dobubblesortthenprocess(arr);
        maxNumberOfProducts=arr[arr.length-1]*arr[arr.length-2];
        minNumberOfProducts=arr[0]*arr[1];
        System.out.println(maxNumberOfProducts+"=="+minNumberOfProducts);
    }

    private static void dobubblesortthenprocess(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

    }
}
