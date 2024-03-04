package org.example.strings;

public class ReverseWordsInPlaceInGivenString {
    public static void main(String[] args) {
        String input="started learning programming ";
        char chArr[]=input.toCharArray();
        int j=0;
        for(int i=0;i<chArr.length;i++){
            if(chArr[i]==' '){
                for(int k=i;k>=j;k--){
                    System.out.print(chArr[k]+"");
                }
                j=i+1;
            }
        }
    }
}
