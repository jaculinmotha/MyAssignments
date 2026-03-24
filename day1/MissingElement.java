package org.testleaf.week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {
    public static void main(String[] args) {
List<Integer> list=new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
list.add(15);
list.add(6);
list.add(8);
Collections.sort(list);
for(int i=1;i<list.size()+8;i++) {
if(!list.contains(i)) {
    System.out.println("The missing element is: " + i);
    }
}
}
}
