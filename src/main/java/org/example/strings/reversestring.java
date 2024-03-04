package org.example.strings;

public class reversestring {
    public static void main(String[] args) {
        String input="kaushal kumar singh joined persistent";
        char chArr[]=input.toCharArray();
        System.out.println("==============way 1================");
        for(int i=0,j=input.length()-1;i<input.length()/2;i++,j--){
            char temp=chArr[i];
            chArr[i]=chArr[j];
            chArr[j]=temp;
        }
        System.out.println(String.valueOf(chArr));
    }
}
