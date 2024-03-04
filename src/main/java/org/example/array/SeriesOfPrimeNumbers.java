package org.example.array;

public class SeriesOfPrimeNumbers {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=true;
                }
            }
            if(!flag){
                System.out.print(i+"   ");
            }
        }
    }
}
