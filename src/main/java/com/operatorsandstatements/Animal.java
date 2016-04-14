package com.operatorsandstatements;



    public class Animal{
        public static void testInts(Integer obj, int var){
            System.out.println( obj );
            System.out.println( var );

            obj = var++;
            System.out.println( obj );

            obj++;
            System.out.println( obj );

        }

        public static void main(String[] args) {
            Integer val1 = new Integer(5);
            int val2 = 9;
            testInts(val1++, ++val2);
            System.out.println(val1+" "+val2);


            System.out.println( 5 == 5.00 );
        }
    }
