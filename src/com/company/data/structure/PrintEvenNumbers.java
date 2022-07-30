package com.company.data.structure;

public class PrintEvenNumbers {

    public  void Recursion(int a) {
        if(a==0){
            System.out.println("Last Element Printed-"+a);
            return;
        }
        System.out.println("The element is-"+a);
         Recursion(a-1);
    }

}
