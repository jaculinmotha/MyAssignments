package org.testleaf.week1.day2;

public class IsPrime {
public static void main(String[] args) {
        int num=7;
    boolean prime=true;
    {
        for (int i=2;i<num;i++){
            if (num%i==0)
                prime=false;
            break;
}

    if (prime==true){
                System.out.println("Prime number");
        }else
         System.out.println("Not Prime number");

}

}
}