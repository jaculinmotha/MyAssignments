package org.testleaf.week4.day1;

import java.util.ArrayList;
import java.util.List;

public class IntersectionUsingList {
public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<Integer>();
    list1.add(3);
    list1.add(2);
    list1.add(11);
    list1.add(4);
    list1.add(6);
    list1.add(7);
    int size1 = list1.size();
    List<Integer> list2 = new ArrayList<Integer>();
    list2.add(1);
    list2.add(2);
    list2.add(8);
    list2.add(4);
    list2.add(9);
    list2.add(7);
    int size2 = list2.size();
    List<Integer> intersection = new ArrayList<>();
    for (int i = 0; i < size1; i++) {
        for (int j = 0; j < size2; j++) {
        if(list1.get(i) == list2.get(j)) {
            intersection.add(list1.get(i));
           }
    }
    System.out.println("Intersection: " + intersection);
    
}
}
}
