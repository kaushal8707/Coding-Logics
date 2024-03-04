package org.example.pattern;
/*
1
23
456
78910
*/
public class Pattern1
{
   static int num=1;

    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(num+" ");
                num=num+1;
            }
            System.out.println();
        }
    }
}
