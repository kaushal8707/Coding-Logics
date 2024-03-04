package org.example.strings;

public class aaabbcccccdprinttoa3b2c5d1 {
    public static void main(String[] args) {
        String str="aaabbcccccd";
        char chArr[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            int count=1;
            for(int j=i+1;j<str.length();j++){
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
