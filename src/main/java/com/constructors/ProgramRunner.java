package com.constructors;

public class ProgramRunner extends Cat {

    int a;

    public static void main(String... args){
        ProgramRunner programRunner = new ProgramRunner();
        ProgramRunner programRunner2 = new ProgramRunner();

        programRunner.a = programRunner2.a = 100;
        System.out.println( programRunner.equals(programRunner2) );
    }
}
