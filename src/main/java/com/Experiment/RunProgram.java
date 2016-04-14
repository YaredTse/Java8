package com.Experiment;

/**
 * Created by yaredtseghu on 09/04/2016.
 */
public class RunProgram extends Lion {

    public RunProgram(){
        super("a");
        System.out.println("3: RunProgram");
        this.aAnimal = 10;
    }

    public void testThisCall(){
        System.out.println( aAnimal );
    }

    public void animalMethod(){
        System.out.println("Animal");
    }

    public static void main(String... string ) {
        Animal animal = new RunProgram();
//        (( RunProgram) animal ).testThisCall();


    }
}
