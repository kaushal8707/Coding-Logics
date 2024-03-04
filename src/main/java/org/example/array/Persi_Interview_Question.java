package org.example.array;
//Find out the length of longest subarray of consecutive elements.
//Arr[]= [3,4,23,6,5,8,10,22,9, 21,20,2]
//output: 5
//        2 3 4 5 6 -5
//        without sorting, treeset,sortedset
public class Persi_Interview_Question {
    public static void main(String[] args) {
         int array[]={3,4,23,6,5,8,10,22,9, 21,20,2};
         array=arrang_element_sorted_order(array);
         int break_point=find_missing_elements(array);
         for(int i=0;i<array.length;i++){
             if(array[i]<break_point){
                 System.out.print(array[i]+"  ");
             }
         }
    }

    private static int find_missing_elements(int[] array) {
        int value=0;
        int difference=array[0];
        for(int i=0;i<array.length;i++){
            if((array[i]-i)!=difference){
                value=i+difference;
                break;
            }
        }
        return value;
    }

    private static int[] arrang_element_sorted_order(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j+1]<array[j]){
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}