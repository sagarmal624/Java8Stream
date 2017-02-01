package com.java;

//nitialize a list and find all elements which are even

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Find_Even {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(l.stream().filter(i -> i % 2 == 0).collect(Collectors.toList()));

    }
}
