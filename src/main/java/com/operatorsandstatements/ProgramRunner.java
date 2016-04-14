package com.operatorsandstatements;

public class ProgramRunner {

    public static void main( String... string ){

        double ffff = 10.0;

//        short aa = 20;
//        byte bb = 40;
//        long ii = aa * ++bb;
//
//
//
//        int a = 20;
//        System.out.println( a );
//
//        long l = a;
//        System.out.println( l );
//
//        float f = l;
//        System.out.println( f );
//
//        double d = f;
//        System.out.println( d );

//        int ddd  = 10;
//        int x =  ddd-- ;
//        System.out.println( x );



        int x = 10;
        int y = 12 * --x + 10 / ++x - 10 + x++ * ++x + 100 - --x;
        //      ( 12 *   9 ) + ( 10 / 10 )  - 10 + ( 10  * 12 )   + 100 - 11;
        //             9        10         11    12          11
        //      108 +  1 - 10 + 210 + 100 - 11
        //

        //  x = 11
        //  y = 398

        System.out.println( x );
        System.out.println( y );


        short sh = 10;
        long lg = 100;
        int in = 20;

        in *= lg + in + sh ;
        System.out.println( in ); // => 150

        Integer a = new Integer(122);
        Integer l = new Integer(12);

        System.out.println( a.equals(l) );

        float f = 0x0123;
        System.out.println( f );


        Integer innnn = new Integer(122);
        Integer innnn2 = new Integer(12);

        innnn = innnn2 + 10;

        int fgf  = 10 + innnn + new Integer(23);

        System.out.println( innnn.equals(innnn2) );
        System.out.println( fgf );

    }
}
