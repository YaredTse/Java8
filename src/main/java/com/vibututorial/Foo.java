package com.vibututorial;

/**
 * Created by yaredtseghu on 06/04/2016.
 */
public class Foo extends Bar {

    public void fooMethod(){
        System.out.println(" FROM FOO ");
        System.out.print( this.getClass() );
    }

    public static void main( String... strings ){
        Bar bar = new Foo();
        bar.testInt();  // com.vibututorial.Foo

        ConcreateClass concreateClass = new Foo();
        Foo newFoo = (Foo)concreateClass;
        newFoo.fooMethod(); // com.vibututoria.Foo

        ConcreateClass concreateClass1 = new Bar();
        concreateClass1.testInt();
//        concreateClass1.fooMethod();
        Foo newFoo1 = (Foo)concreateClass1;
        newFoo1.fooMethod();

//        Foo foo = (Foo)concreateClass1;
//        foo.fooMethod();

    }
}


