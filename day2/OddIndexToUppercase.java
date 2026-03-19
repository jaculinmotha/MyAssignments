package org.testleaf.Week3.day2;

public class OddIndexToUppercase {
public static void main(String[] args) {
    String test="changeme";
    char[] chararr=test.toCharArray();
    for(int i=0;i<=test.length()-1;i++){
        if(i%2==1){
           chararr[i]=Character.toUpperCase(chararr[i]);{
                       System.out.println(chararr[i]);
        }
    }
}
}
}
