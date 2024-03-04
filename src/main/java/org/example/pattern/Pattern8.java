package org.example.pattern;
/*
1 2 3 4 5 6
 2 3 4 5 6
  3 4 5 6
   4 5 6
    5 6
     6
*/
public class Pattern8
{
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
           for(int k=i+1;k<=5;k++)
           {
               System.out.print(" "+k);
           }
            System.out.println();
       }
}}
