package com.Experiment;


class InterfaceA {
    public boolean isBlind(){
        return true;
    }
}


public class Dog extends InterfaceA {

    public boolean isBlind(){
        return false;
    }

    public static void main( String... strings) {
        InterfaceA interfaceA = (InterfaceA) new Dog();
        System.out.println(interfaceA.isBlind());
    }
}
