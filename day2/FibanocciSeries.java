package org.testleaf.week1.day2;

public class FibanocciSeries {
    public static void main(String[] args) {
    int a=0;
    int b=1;
    int c;

    for (int i=0; i<8; i++)
    {
       System.out.println(a);
       c=a+b;
       a=b;
       b=c;
    }
    }
}

