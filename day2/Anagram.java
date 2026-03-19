package org.testleaf.Week3.day2;

import java.util.Arrays;

public class Anagram {
public static void main(String[] args) {
    String text1="stops";
    String text2="potss";
    char[] a=text1.toCharArray();
    char[] b=text2.toCharArray();
    int alength=a.length;
    int blength=b.length;
              if(alength!=blength){
                    System.out.println("Length mismatch");
       }

    Arrays.sort(a);
    Arrays.sort(b);
    if(Arrays.equals(a, b)){
        System.out.println("The given strings are Anagram");
    }else{
        System.out.println("The given strings are not Anagram");
    }
}
}
