package com.java;
//Sort the given list in descending order having distinct elements:

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_List {
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(14, 12, 11, 10, 16, 15, 12, 10, 99, 90, 14, 16, 35);
//ascending order
//        lst.stream().distinct().
//                sorted(Integer::compare).collect(Collectors.toList())
//                .forEach(System.out::println);


        //descending

        lst.stream().distinct().
                sorted((a, b) -> Integer.compare(b, a)).collect(Collectors.toList())
                .forEach(System.out::println);


    }
}
