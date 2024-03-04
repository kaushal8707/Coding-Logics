package org.example.strings;

public class StartPrintingWordsFromReverse {
    public static void main(String[] args) {
        String input=" now started learning coding";
        char chArr[]=input.toCharArray();
        int j=chArr.length-1;
        for(int i=chArr.length-1;i>=0;i--){
            if(chArr[i]==' '){
                for(int k=i;k<=j;k++){
                    System.out.print(chArr[k]+"");
                }
                j=i-1;
            }
        }
    }
}
