package java_7_switch.array;

public class factorial {
    public static void main(String[] args) {
        int input=6;
        facto(input);
        int result=facto_recursion(input);
        System.out.println(result);
    }

    private static int facto_recursion(int input) {
        if(input==1){
            return 1;
        }
        return input * facto_recursion(input-1);
    }

    private static void facto(int input) {
        int fact=1;
        while(input!=0){
            fact=fact*input;
            input--;
        }
        System.out.println(fact+"");
    }
}
