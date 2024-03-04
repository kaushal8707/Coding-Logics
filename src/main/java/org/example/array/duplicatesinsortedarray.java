package java_7_switch.array;

public class duplicatesinsortedarray {
    public static void main(String[] args) {
        int arr[]= {3,6,8,8,10,12,15,15,15,20};
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=arr[i-1]){
                System.out.println(arr[i]);
            }
        }
    }
}
