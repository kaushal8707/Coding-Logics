package org.example.strings;

public class RemoveConsecutiveCharacter {
    public static void main(String[] args) {
        String input = "aaabbcccddeeee";
        char chArr[]=input.toCharArray();
        char lastIndex=' ';
        for(int i=0;i<chArr.length-1;i++){
            if(chArr[i]==chArr[i+1] && lastIndex!=chArr[i]){
                System.out.println(chArr[i]);
                lastIndex=chArr[i+1];
            }
        }


    }
}
