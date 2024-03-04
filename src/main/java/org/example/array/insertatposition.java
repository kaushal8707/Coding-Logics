package java_7_switch.array;

import java.util.Arrays;

public class insertatposition {
    public static void main(String[] args) {
        int arr[]= {5,2,9,3,6,4,1,8,7};
        int position=5;
        int x=44;
        int newArray[]=new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(i<position-1){
                newArray[i]=arr[i];
            }else{
                newArray[i+1]=arr[i];
            }
        }
        newArray[position-1]=x;
        Arrays.stream(newArray).forEach(System.out::println);
    }
}
