package java_7_switch.array;

import java.util.Arrays;

public class insertelementinsortedarray {
    public static void main(String[] args) {
        int arr[]= {2,5,18,20,29,32,40};
        int newArray[]=new int[arr.length+1];
        int x=27;
        int position=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<x){
                newArray[i]=arr[i];
                position++;
            }else{
                newArray[i+1]=arr[i];
            }
        }
        newArray[position]=x;
        Arrays.stream(newArray).forEach(System.out::println);
    }
}
