package com.fields;

import java.util.Arrays;

public class Lion extends Animal {

    public String name = "Lion";

    public static void main(String... string ) {

        String a = new String("TEST");
        StringBuilder b = new StringBuilder("TEST");

        System.out.println( a.equals(b)  );

        System.out.println( 12 + 12 + 12 + "Test" );  //
        System.out.println( 12 + 12 + 12 );
        System.out.println( "Test" + 12 + 12 + 12 );

        String [] strArr = { "2", "3", "a1" };
        Arrays.sort(strArr);

        for( String s : strArr )
          System.out.println( s  );


        int[] intA = { 6, 2, 8, 9, 4, 2 };
        Arrays.sort(intA);

        for( int ccc : intA )
          System.out.print( ccc );

        System.out.println(  );
        System.out.println( Arrays.binarySearch( intA, 20) );  // =>  -7

    }
}
