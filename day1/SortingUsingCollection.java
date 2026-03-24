package org.testleaf.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class SortingUsingCollection {
public static void main(String[] args) {
    List<String> companyList=new ArrayList<String>();
    companyList.add("HCL");
    companyList.add("Wipro");
    companyList.add("Aspire Systems");
    companyList.add("CTS");
    Collections.sort(companyList);
    for(int i=companyList.size()-1;i>=0;i--) {
        System.out.println(companyList.get(i));
    }
   
}
}
