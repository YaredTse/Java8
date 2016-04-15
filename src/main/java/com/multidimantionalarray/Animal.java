package com.multidimantionalarray;

import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Animal {

    public static void main( String[] st ) {
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list

        System.out.println(list.size()); // 2

        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]

        for (String b : array)
            System.out.print(b + " "); // new test

//        list.remove(1); // throws UnsupportedOperation Exception

        List<Integer> intA = new ArrayList<Integer>();
        intA.add(20);
        intA.add(5);
        intA.add(17);

        Collections.sort(intA);
        System.out.println();
        System.out.println();
        System.out.println( intA );

        Period period = Period.ofYears(1);

    }
}
