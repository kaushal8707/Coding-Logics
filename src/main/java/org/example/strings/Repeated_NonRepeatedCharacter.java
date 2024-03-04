package org.example.strings;

public class Repeated_NonRepeatedCharacter {
    public static void main(String[] args) {
        String str="kaushal kumar singh";
        char []chArray=str.toCharArray();
        for(int i=0;i<chArray.length;i++){
            int count=1;
            for(int j=i+1;j<chArray.length;j++){
                if(chArray[i]==chArray[j]){
                    count++;
                    chArray[j]='0';
                }
            }
            if(count>1 && chArray[i]!='0'){
                System.out.println("Repeated - "+chArray[i]);
            }else if(count==1 && chArray[i]!='0'){
                System.out.println("Non - Repeated - "+chArray[i]);
            }
        }
    }
}
