package com.java;
// Consider the following list: [new Integer(5), "12", new StringBuilder("sagar"),new ArrayList<>() ] Print the class name of each element

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Get_Class_Of_List_Items {
    public static void main(String[] args) {
        List<Object> lst = Arrays.asList(new Integer(5), "12", new StringBuilder("sagar"), new ArrayList<>());
        lst.stream().map(it -> it.getClass().getName()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
