package com.java;
//Create a set from a list containing duplicate elements. What do you observe? How can you achieve the same result without converting a list to a set?

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Convert_List_To_Set {

    public static void main(String[] args) throws IndexOutOfBoundsException {
        List<Integer> l = Arrays.asList(1, 5, 3, 4, 5, 6, 7, 2, 5, 10);
        // convert list to set

        Set set = new HashSet<Integer>(l);
        System.out.println(set);

        List<Integer> lst = Arrays.asList(2, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5);

        //without using hashset constructor

        System.out.println(lst.stream().collect(Collectors.toSet()));
    }
}
