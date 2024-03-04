package java_7_switch.array;

public class deletefromposition {
    public static void main(String[] args) {
        int arr[]= {5,2,9,3,6,4,1,8,7};
        int deletedArr[]=new int[arr.length-1];
        int position=3;
        for(int i=0;i<arr.length;i++){
            if(i<position-1){
                deletedArr[i]=arr[i];
            }else if(i>position-1){
                deletedArr[i-1]=arr[i];
            }
        }
        for(int m:deletedArr){
            System.out.print(m+"-");
        }

    }
}
