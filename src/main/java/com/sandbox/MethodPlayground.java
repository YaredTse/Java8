package com.sandbox;

public class MethodPlayground {

    // This class demonstrates how you can have two methods
    // optional specifiers written in different order
    // in this case testA states "static final "
    // where as testA is changed to  "final static "

    public static final void testA(){
        System.out.println(" THIS IS A TEST ");
    }

    public final static void testB(){
        System.out.println(" THIS IS A TEST ");
    }

    public static void main(String[] strings ) {

        MethodPlayground.testA();
        MethodPlayground.testB();

    }

}
