package com.staticmembers;

public class Animal {

    public static String test = "Test";

    public static void testApp(){
        System.out.println( "This is from static method ");
    }

    public static void main( String... strings){
        System.out.println( Animal.test             );
        System.out.println( new Animal().test       );
        Animal.testApp();
        new Animal().testApp();

        System.getProperties().list( Animal );
    }
}
