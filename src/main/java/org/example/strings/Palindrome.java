package org.example.strings;

public class Palindrome {
    public static void main(String[] args) {
        String input="madam";
        boolean result=palindrome(input);
        if(result){
            System.out.println(input+"  is not a palindrome !!!");
        }else{
            System.out.println(input+"  is a palindrome !!!");
        }
        boolean recursive_result=palindrome_recursive(input);
        if(recursive_result){
            System.out.println(input+"  is a palindrome !!!");
        }else{
            System.out.println(input+"  is not a palindrome !!!");
        }
    }

    private static boolean palindrome_recursive(String input) {
        if(input.length()==0)
            return false;
        if(input.length()==1)
            return true;
        if(input.charAt(0)==input.charAt(input.length()-1)){
            return palindrome_recursive(input.substring(1,input.length()-1));
        }
        return false;
    }

    private static boolean palindrome(String input) {
        char chArray[]=input.toCharArray();
        boolean check=false;
        for(int i=0,j=chArray.length-1;i<chArray.length/2;i++,j--){
            if(chArray[i]!=chArray[j]){
                check=true;
            }
        }
        return check;
    }
}
