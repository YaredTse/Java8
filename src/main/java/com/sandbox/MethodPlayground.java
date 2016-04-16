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

    public final static void testC(){
        System.out.println(" Will Not be printed ");
        return;
//        System.out.println(" Will Not be printed ");
    }

    public int testC(int a){
        if( a == 4 );
            return 1;
    }

    public static void main(String[] strings ) {
        MethodPlayground.testA();
        MethodPlayground.testB();

        new MethodPlayground().testC(5);
    }

}
