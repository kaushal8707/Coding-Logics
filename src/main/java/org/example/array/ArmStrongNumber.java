package org.example.array;

public class ArmStrongNumber {
    public static void main(String[] args) {
        int input=153;
        int temp=input;
        int rem=0;
        int sumCubes=0;
        while(input!=0){
            rem=input%10;
            sumCubes+=(rem*rem*rem);
            input=input/10;
        }
        if(temp==sumCubes){
            System.out.println(temp+" is armstrong");
        }else{
            System.out.println(temp+" is not armstrong");
        }
    }
}
