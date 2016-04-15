package com.sandbox;

public class Africa {

    public static void main( String[] string ) {

        String a = "one";
        String b = new String( a );
        String c = new String("one");

        System.out.println( a == b  );  // false
        System.out.println( b == c  );  // false
        System.out.println( a == c  );  // false

        System.out.println(  a.equals(b)  ); // true
        System.out.println(  a.equals(c)  ); // true
        System.out.println(  b.equals(c)  ); // true


    }

}
