package com.multidimantionalarray;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.List;

public class Lion {

    public static void main(String[] strings ) {
        int[][] multi2D = new int[3][3];

        multi2D[0][0] = 12;
        multi2D[0][1] = 13;
        multi2D[0][2] = 14;
        multi2D[1][0] = 15;
        multi2D[1][1] = 15;
        multi2D[1][2] = 15;
        multi2D[2][0] = 15;
        multi2D[2][1] = 15;
        multi2D[2][2] = 15;


        System.out.println( "Price" + "    " );
        for( int i = 0; i < multi2D.length; ++i  ) {
            for ( int j = 0; j < multi2D[i].length; ++j ) {
                System.out.print( multi2D[i][j] + "    " );
            }
            System.out.println();
        }



        List<String> listInt = new ArrayList<String>();
        listInt.add("a");
        listInt.add("a");
        listInt.add("a");
        listInt.add("a");
        System.out.println( listInt.size() );

        for( String str : listInt )
            System.out.println( str );

        listInt.remove("a");
        listInt.remove(2);
        System.out.println( listInt.size() );

        listInt.set(0, "this");

        System.out.println( listInt.size() );
        listInt.remove(1);
        System.out.println( listInt.size() );


        for( String str : listInt )
            System.out.println( str );



        boolean bool = true;

        Boolean bl = bool;

        boolean lp = Boolean.parseBoolean("true");
        boolean bl1 = Boolean.TRUE;

    }
}
