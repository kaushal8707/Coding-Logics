package org.example.strings;

public class FindingDuplicatesInString {
    public static void main(String[] args) {
        String input="finding";
        char array[]=input.toCharArray();
        for(int i=0;i<array.length-1;i++){
            int count=1;
            for(int j=i+1;j<array.length;j++){
                if(array[i]==array[j]){
                    count++;
                    array[j]='0';
                }
            }
            if(count>1 && array[i]!='0'){
                System.out.print(array[i]+"  ");
            }
        }
    }
}
