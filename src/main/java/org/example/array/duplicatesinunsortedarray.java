package java_7_switch.array;

public class duplicatesinunsortedarray {
    public static void main(String[] args) {
        int arr[]= {8,3,6,4,6,5,6,8,2,7};
        for(int i=0;i<arr.length-1;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[j]=-1;
                    count++;
                }
            }
            if(count>1 && arr[i]!=-1){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
