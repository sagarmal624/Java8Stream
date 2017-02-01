package com.java;
// Remove all records from a list which is odd

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Remove_Item_From_List {

    public static void main(String[] args) {
        List<Integer> first = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        first.removeIf(i -> i % 2 != 0);
        first.forEach(System.out::println);
    }
}
