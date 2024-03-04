package org.example.array;

public class FactorialFinding {
    public static void main(String[] args) {
        int number=5;
        int result=factorial(number);
        System.out.println(result);

        System.out.println("====================");

        int results=factorial_recursive(number);
        System.out.println(results);
    }
    public static int factorial(int num){
        int fact=1;
        while(num>0){
            fact*=num;
            num--;
        }
      return fact;
    }

    public static int factorial_recursive(int num){
        if(num==1)
            return 1;
        return num * factorial_recursive(num-1);
    }

}
