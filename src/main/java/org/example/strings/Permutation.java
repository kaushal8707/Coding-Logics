package org.example.strings;

public class Permutation {
    public static void main(String[] args) {
        String input="ABCD";
        int l=0;
        int r=input.length()-1;
        permutation(input,l,r);
    }

    private static void permutation(String input, int l, int r) {
        if(l==r){
            System.out.println(input);
        }else{
            for(int i=l;i<=r;i++){
                input=swapp(input,i,l);
                permutation(input,l+1,r);
                input=swapp(input,i,l);
            }
        }
    }

    private static String swapp(String input, int i, int l) {
        char chArr[]=input.toCharArray();
        char temp=chArr[i];
        chArr[i]=chArr[l];
        chArr[l]=temp;

        return String.valueOf(chArr);
    }
}
