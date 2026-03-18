package org.testleaf.Week3.day1;

import java.util.Arrays;

public class FindMissingElement {
public static void main(String[] args) {
    int[] arr={1,4,3,2,8,6,7};
    Arrays.sort(arr);
    int alength=arr.length;
    for(int i=arr[0];i<alength-1;i++){
        if(arr[i+1]-arr[i]>1){
      System.out.println(arr[i]+1);
        }
    }
}
}
