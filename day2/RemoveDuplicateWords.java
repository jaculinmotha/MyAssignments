package org.testleaf.Week3.day2;

import java.util.Arrays;

public class RemoveDuplicateWords {
public static void main(String[] args) {
    String text="We learn Java basics as part of java sessions in java week1";
   String[] split=text.split(" ");
    for(int i=0;i<split.length;i++){
    for(int j=i+1;j<split.length;j++){
    if(split[i].equalsIgnoreCase(split[j])){
        split[j]=" ";
    }
    }
    } 
    //String string=split.toString();
    String str=Arrays.toString(split);
    System.out.println(str);
    }
}


