package java_7_switch.array;

public class findmissingnumberInunsortedarray {
    public static void main(String[] args) {
        int A[]= {3,7,4,9,6,1,11,2,10};
        int arr[]=new int[12];
        for(int i=0;i<A.length;i++){
            arr[A[i]]++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]==0){
                System.out.print(j+" == ");
            }
        }
    }
}
