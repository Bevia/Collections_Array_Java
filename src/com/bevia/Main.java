package com.bevia;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("element_1");
        arrayList.add("element_3");
        arrayList.add("element_4");
        arrayList.add("element_2");
        arrayList.add("element_5");

        System.out.println("Elements in ArrayList prior to sorting: ");

        //for java 5 and up you must use this for loop:

        for (String element : arrayList)
            System.out.println(element);

        // this is the same: but it only works for java 8!
        //arrayList.forEach(System.out::println);

        Collections.sort(arrayList);

        System.out.println("Elements in ArrayList sorted: ");

        for (String element : arrayList)
            System.out.println(element);

    }
}
