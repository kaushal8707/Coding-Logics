package org.example.strings;

import java.util.HashSet;

public class longestsubstringwithoutrepeatingcharacters {
    public static void main(String[] args) {
        String str="kaushal";
        HashSet<Character> set=new HashSet<Character>();
        int i=0;
        int maxCount=0;
        for(int j=0;j<str.length();j++){
            if(!set.contains(str.charAt(j))){
                set.add(str.charAt(j));
                maxCount=Math.max(maxCount,(j+1-i));
            }else{
                while(str.charAt(i)!=str.charAt(j)){
                    set.remove(str.charAt(i));
                    i++;
                }
                set.remove(str.charAt(i));
                i++;
                set.add(str.charAt(j));
            }
            System.out.println(str.substring(i,j+1)+"----"+(j+1-i));
        }
    }
}
