package com.java.tester;

public class Tester {

    public static void main(String[] args) {

        //Checking the boxes are having same dimension or not.

        Box b1 = new Box(10,20,30);
        Box b2 = new Box(10,20,30);

        if(b1.isBoxEqual(b2)){
            System.out.println("Both the boxes are equal");
        }else{
            System.out.println("Both the boxes are not equal");
       }
    }
}
