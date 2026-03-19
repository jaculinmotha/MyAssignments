package org.testleaf.Week3.day2;

public class ReverseOddWords {
public static void main(String[] args) {
    String text="I am a software tester";
    String[] split=text.split(" ");
    String oddWords;
    for(int i=0;i<split.length;i++){
        if(i%2==1)
            {
            oddWords=split[i];
            char[] chararr=oddWords.toCharArray();
            for(int j=chararr.length-1;j>=0;j--){
                System.out.print(chararr[j]);

            }
            
        }else{
            System.out.print(split[i]);
        }
        System.out.print(" ");
    }
    
        }
    }

