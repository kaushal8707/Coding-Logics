package org.example.strings;

//anagram means both input should be equals in length and contents all should be same.
public class AnagramCheck {
    public static void main(String[] args) {
        String str1="medical";
        String str2="decimal";
        boolean pass=checkanagram(str1,str2);
        if(pass){
            System.out.println(str1+" and "+str2+"  are anagram....!!!");
        }else{
            System.out.println(str1+" and "+str2+"  are not an anagram....!!!");

        }
    }

    private static boolean checkanagram(String str1, String str2) {
        boolean flag=false;
        if(str1.length()!=str2.length())
            return false;
        str1=doArrangement(str1);
        str2=doArrangement(str2);
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }

    private static String doArrangement(String str) {
        char chArr[]=str.toCharArray();
        for(int i=0;i<chArr.length-1;i++){
            for(int j=0;j<chArr.length-1-i;j++){
                if(chArr[j+1]<chArr[j]){
                    char temp=chArr[j+1];
                    chArr[j+1]=chArr[j];
                    chArr[j]=temp;
                }
            }
        }
        return String.valueOf(chArr);
    }
}
