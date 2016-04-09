package com.vibututorial1;


public class RunProgram {

    public static void main(String... string) {

        // The first example has a reference type of Animal
        // And the run time type is Animal, and when I send the #animalMethod message
        // Everything is fine because the method is defined in the reference typr and the run tyme type has access to it.

        // Staring from Animal
        Animal animal = new Animal();
        animal.animalMethod();  // => Original ANimal


        // The second example is to show that I do not have acccess to method defined inside Lion#lionMethod
        // Since the run time is different

//        Animal animal2 = new Animal();
//        animal.lionMethod();  // => Compile error

        //  To FIX it I change the Run time object to Lion
        Animal animalCast = new Lion();
        // BEFORE OVERRIDING
        // This runs fine sinse the refernce type is Animal and it passsed at compile time,
        // Because it verified that Animal reference includes animalMethod method,
        // And the look up starts at Lion()

        // animalCast.animalMethod(); => Original ANimal

        // AFTER OVERRIDING
         animalCast.animalMethod(); //=> Overridden  on Lion

        // Introduction of new methods
        // animalCast.lionMethod(); Fails at compile time because the method is not in the reference type Animal

        // TO FIX, Casting comes in this is the process of Changing the reference type
        ((Lion)animalCast).lionMethod();  // => Original Lion

        // OR

        Lion lion = (Lion)animalCast;
        lion.lionMethod();

        // And last but not least

        Animal animal1 = new Tiger();
        animal1.animalMethod();  // => Original ANimal

//        animal.tigerMethod(); =>  Fails at compile time since the reference type Animal does not know about #tigerMethod

        // TOFIX use casting again, the animal reference to pint to Tiger

        ((Tiger)animal1).tigerMethod();
        // OR
        Tiger tiger = (Tiger) animal1;
        tiger.tigerMethod();

        // Thie method animalMethod still works with tiger reference since the run time type is Tiger and starts to look
        // for the method animalMethod from Tiger object
        animal1.animalMethod();

    }

}
