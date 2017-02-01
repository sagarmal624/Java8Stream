package com.java;
// Find whether two lists have a common element or not

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Intersect_List {

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(11, 12, 13, 14);
        List<Integer> sec = Arrays.asList(13, 14, 15);
        List<Integer> lst = first.stream().filter(i -> sec.contains(i)).collect(Collectors.toList());
        lst.forEach(System.out::println);


    }
}
