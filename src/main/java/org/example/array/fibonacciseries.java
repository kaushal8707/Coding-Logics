package java_7_switch.array;

public class fibonacciseries {
    public static void main(String[] args) {
        fibonacci(10);
        System.out.println("======================");
        fibonacci_recursion(10);
    }

    private static void fibonacci_recursion(int i) {
        for(int j=0;j<i;j++){
            System.out.print(fibo(j)+" ");
        }
    }

    private static int fibo(int i) {
        if(i==0 || i==1){
            return i;
        }
        return fibo(i-1)+fibo(i-2);
    }

    private static void fibonacci(int i) {
        int count=0;
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2+" ");
        while(count<i-2){
            int sum=n1+n2;
            System.out.print(sum+" ");
            n1=n2;
            n2=sum;
            count++;
        }
    }
}
