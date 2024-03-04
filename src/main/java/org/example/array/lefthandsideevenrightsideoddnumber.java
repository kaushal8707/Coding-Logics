package java_7_switch.array;

public class lefthandsideevenrightsideoddnumber {
    public static void main(String[] args) {
        Integer arr[]={1,2,3,4,5,6,7,8,9};
        int newArr[]=new int[arr.length];
        int j=0;
        int k=arr.length-1;
        int i=0;
        while(i<arr.length){
            if(arr[i]%2==0){
                newArr[j]=arr[i];
                j++;
            }else{
                newArr[k]=arr[i];
                k--;
            }
            i++;
        }
        for(int d:newArr){
            System.out.print(d+"  ");
        }

    }
}
