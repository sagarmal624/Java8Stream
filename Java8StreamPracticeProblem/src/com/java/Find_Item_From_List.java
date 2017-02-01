package com.java;
//Given two lists [11, 12, 13, 14] and [13, 14, 15],
// how would we obtain the list of items from the first that are not in the second?

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Find_Item_From_List {

    public static void main(String[] args) {
        List<Integer> first = Arrays.asList(11, 12, 13, 14);
        List<Integer> sec = Arrays.asList(13, 14, 15);
        List<Integer> lst = first.stream().filter(i -> !sec.contains(i)).collect(Collectors.toList());
        lst.forEach(System.out::println);

    }
}
