package com.BitwiseOPerators;

public class BitWise {

    public static void main(String[] strings ) {

        int a = 15; // 0000 1111
        int b = 27; // 0001 1011

        int and = a&b; //  0000 1011
        System.out.println( Integer.toBinaryString( and ));
        String aaAnd = Integer.toBinaryString( and );
        System.out.println( Integer.parseInt( aaAnd, 2) );
        System.out.println();

        int or = a|b;  //  0001 1111
        System.out.println( Integer.toBinaryString( or ) );
        String aaOr = Integer.toBinaryString( or );
        System.out.println( Integer.parseInt( aaOr, 2) );
        System.out.println();


        int xor = a^b; //  0001 0100
        System.out.println( Integer.toBinaryString( xor ) );
        String aaXor = Integer.toBinaryString( b );
        System.out.println( Integer.parseInt( aaXor, 2) );
        System.out.println();


        int oneComplement = ~a; // 0001 0000
        System.out.println( Integer.toBinaryString( oneComplement ) );
        String aaComp = Integer.toBinaryString( b );
        System.out.println( Integer.parseInt( aaComp, 2) );
        System.out.println();


//        int xor = a ^ b;
//        int xor = a ^ b;
//        int xor = a ^ b;
    }
}
