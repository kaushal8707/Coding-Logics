package org.example.strings;

public class aaabbcccccd_to_a3b2c5d1 {
    public static void main(String[] args) {
        String input="aaabbcccccd";
        char chArr[]=input.toCharArray();
        for(int i=0;i<input.length();i++){
            int count=1;
            for(int j=i+1;j<input.length();j++){
                if(chArr[i]==chArr[j]){
                    count++;
                    chArr[j]='0';
                }
            }
            if(count>0 && chArr[i]!='0'){
                System.out.print(chArr[i]+""+count);
            }

        }
    }
}
