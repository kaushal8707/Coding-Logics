package org.example.array;

public class FindFibonacci {
    public static void main(String[] args) {
        int count=10;
        fibonacci(count);
        System.out.println();
        System.out.println("====================");
        for(int i=0;i<10;i++){
            System.out.print(fibonacci_recursion(i)+" ");
        }
    }

    public static void fibonacci(int count){
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        int i=0;
        while(i<count-2){
            int sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
            i++;
        }
    }
    public static int fibonacci_recursion(int num){
        if(num==0 || num==1)
            return num;

        return fibonacci_recursion(num-1)+fibonacci_recursion(num-2);
    }
}
