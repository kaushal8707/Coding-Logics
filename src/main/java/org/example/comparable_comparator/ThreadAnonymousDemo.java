package org.example.comparable_comparator;

public class ThreadAnonymousDemo
{
    public static void main(String[] args) {

        Thread thread1=new Thread()
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName()+"  is Running. . . ");
            }
        };
        thread1.start();
        Thread thread2=new Thread()
        {
            @Override
            public void run()
            {
                System.out.println(Thread.currentThread().getName()+"  is Running. . . ");
            }
        };
        thread2.start();
    }
}
