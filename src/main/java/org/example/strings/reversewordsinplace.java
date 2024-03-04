package org.example.strings;

public class reversewordsinplace {
    public static void main(String[] args) {
        String sentence=" Sapient is the Best Organization Compare to other Org";
        int j=sentence.length()-1;
        for(int i=sentence.length()-1;i>=0;i--){
            if(sentence.charAt(i)==' ') {
                for (int k = i; k <= j; k++) {
                    System.out.print(sentence.charAt(k));
                }
                j = i - 1;
            }
        }
    }
}
