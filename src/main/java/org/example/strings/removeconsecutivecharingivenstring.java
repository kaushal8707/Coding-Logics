package org.example.strings;

public class removeconsecutivecharingivenstring {
    public static void main(String[] args) {
        String str="aaabbcccddeeee";
        char lastIndex=' ';
        char chArr[]=str.toCharArray();
        for(int i=0;i<chArr.length-1;i++){
            if(chArr[i]==chArr[i+1] && lastIndex!=chArr[i]){
                System.out.println(chArr[i]+"");
                lastIndex=chArr[i];
            }
        }
    }
}
