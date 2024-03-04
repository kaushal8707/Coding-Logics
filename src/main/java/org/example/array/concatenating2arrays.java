package java_7_switch.array;

public class concatenating2arrays {
    public static void main(String[] args) {
        int arr1[] = { 6, 7, 8, 9, 10 };
        int arr2[] = { 1, 2, 3, 4, 5 };
        int array[]=new int[arr1.length+arr2.length];
        int count=0;
        for(int i=0;i<arr1.length;i++){
            array[count]=arr1[i];
            count++;
        }
        for(int j=0;j<arr2.length;j++){
            array[count]=arr2[j];
            count++;
        }
        for(int n:array){
            System.out.print(n+" ");
        }

    }
}
