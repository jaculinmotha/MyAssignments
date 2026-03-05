package org.testleaf.week1.day2;

public class Palindrome {
public static void main(String[] args) {
    int num=1221;
    int original=num;
    int rev=0;
    for (int i=num;i>0;i=i/10){
        int digit=i%10;
        rev=rev*10+digit;
    }
    System.out.println(rev);
if (original==rev){
    System.out.println("Prime number");
}else{
    System.out.println("Not Prime number");
}
}
}