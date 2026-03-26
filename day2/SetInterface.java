package org.testleaf.week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterface {
public static void main(String[] args) {
    String companyName="Google";
    char[] charArray=companyName.toCharArray();
    Set<Character> charSet=new LinkedHashSet<Character>();
    for(int i=0;i<charArray.length;i++) {
        charSet.add(charArray[i]);
    }
    for(Character name : charSet) {
        System.out.print(name);
}
}
}
