package org.example.strings;

public class repeatedandnonrepeatedcharacter {
    public static void main(String[] args) {
        String str="kaushal kumar singh";
        char chArr[]=str.toCharArray();
        for(int i=0;i<chArr.length;i++){
            int count=1;
            for(int j=i+1;j<chArr.length;j++){
                if(chArr[i]==chArr[j]){
                    count++;
                    chArr[j]='0';
                }
            }
            if(count>1 && chArr[i]!='0'){
                System.out.print(chArr[i]);
            }

            if(count==1 && chArr[i]!='0'){
                System.out.print(chArr[i]);
            }
        }
    }
}
