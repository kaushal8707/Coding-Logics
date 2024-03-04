package java_7_switch.array;

import java.util.Arrays;

public class pairofelementsinsortedarray {
    public static void main(String[] args) {
        int arr[]= {1,3,4,5,6,8,9,10,12,14};
        int sum=15;
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+"  "+arr[j]);
                i++;
                j--;
            }else if(arr[i]+arr[j]<sum){
                i++;
            }else{
                j--;
            }
        }
    }
}
