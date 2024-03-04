package org.example.pattern;
/*
      1
     2 3
    4 5 6
   7 8 9 10
  11 12 13 14

 */
public class Pattern6
{
static int num=1;
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5-i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++)
            {
                System.out.print(" "+num);
                num=num+1;
            }
            System.out.println();
        }
    }
}
