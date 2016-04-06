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
        Bar bar2 = (Bar)concreateClass1;
        bar2.testInt();

        // Ok, my assamption when I did this
        // I was thinking interms of Ineritance of the class.

        // I understunnd that there is a Bolob in the momory
        // with the lable Bar
        ConcreateClass cc = new Bar();
        // And since Foo inherits from Bar
        // I was under the impression that the inheriting class
        // is able to downcast it to Foo
        Foo f = (Foo)concreateClass1;
        bar2.testInt();

    }
}


