package java_7_switch.array;

public class findingmultiplemissingsumberInsortedarray {
    public static void main(String[] args) {
        int arr[]= {6,7,8,9,11,12,15,16,17,19};
        int diff=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]-i!=diff){
               while(diff<arr[i]-i){
                   System.out.println(i+diff);
                   diff++;
               }
            }
        }
    }
}
