package org.example.strings;

public class reversewordsinsameplace {
    public static void main(String[] args) {
        String sentence="Sapient is the Best Organization Compare to other Org ";
        int j=0;
        char chArr[]=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)==' '){
                for(int k=i;k>=j;k--){
                    System.out.print(sentence.charAt(k)+"");
                }
                j=i+1;
            }
        }
    }
}
