package com.staticmembers;

public class Animal {

    public static String test = "Test";

    public static void testApp(){
        System.out.println( "This is from static method ");
    }

    public static void changeRefernceType( LionX l ){
        l.name = "method";
    }

    public static void main( String... strings){

        System.out.println( Animal.test             );
        System.out.println( new Animal().test       );
        Animal.testApp();
        new Animal().testApp();


        int a = 100;
        System.out.println(a);
        int b = a;

        System.out.println(b);

        a = 20;
        System.out.println( a );

        LionX ln = new LionX();
        System.out.println(  ln.name );
        changeRefernceType( ln );

        System.out.println( ln.name );

    }
}

class LionX {
    String name = "Test";
}
