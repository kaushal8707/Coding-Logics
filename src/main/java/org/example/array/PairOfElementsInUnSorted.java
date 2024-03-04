package org.example.array;

public class PairOfElementsInUnSorted {
    public static void main(String[] args) {
        int arr[]= {6,3,8,10,16,7,5,2,9,14};
        int sum=17;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println(arr[i]+" , "+arr[j]);
                }
            }
        }
    }
}
