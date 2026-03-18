package org.testleaf.Week3.day1;

public class FindIntersection {
public static void main(String[] args) {
    int[] a={3,2,11,4,6,7};
    int[] b={1,2,8,4,9,7};
    int alength=a.length;
    int blength=b.length;
    for(int i=0;i<alength;i++){
        for(int j=0;j<blength;j++){
            if(a[i]==b[j]){
                System.out.println(a[i]); 
            }
             
        }
    }
    
}
}
