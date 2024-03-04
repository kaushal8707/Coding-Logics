package java_7_switch.array;

public class primeseries {
    public static void main(String[] args) {
        Integer input=100;
        for(int i=2;i<=input;i++){
            boolean flag=false;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=true;
                }
            }
            if(!flag){
                System.out.print(i+" : ");
            }
        }
    }
}
