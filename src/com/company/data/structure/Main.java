package com.company.data.structure;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        ExampleRecursion();
    }


    public static void ExampleRecursion(){
        PrintEvenNumbers o = new PrintEvenNumbers();
        o.Recursion(10);
    }
}
