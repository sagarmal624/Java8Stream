package com.java;
//count number of occurrences of String in a String[] in Java?

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Count_String {
    public static void main(String[] args) {
        String[] str = {"sagar", "rahul", "ankit", "sagar"};
        List<String> distinctList = Arrays.asList(str).stream().distinct().collect(Collectors.toList());
        for (String s : distinctList)
            System.out.println(s + "=" + Collections.frequency(Arrays.asList(str), s));
    }
}
