package org.example.array;

public class PrimeOrNot {
    public static void main(String[] args) {
        int input=23;
        boolean flag=false;
        for(int i=2;i<input/2;i++){
            if(input%i==0){
                flag=true;
            }
        }
        if(!flag){
            System.out.println(input+" is prime");
        }else{
            System.out.println(input+" is not prime");
        }
    }
}
