package com.java;
//Consider the following map: Map m = [‘Computing’ : [‘Computing’ : 600, ‘Information Systems’ : 300],
// ‘Engineering’ : [‘Civil’ : 200, ‘Mechanical’ : 100],
// ‘Management’ : [‘Management’ : 800] ]
// 22a) How many university departments are there?
// 22b) How many programs are delivered by the Computing department?
// 22c) How many students are enrolled in the Civil Engineering program?

import java.util.*;

public class Operation_On_Map {
    public static void main(String[] args) {
        Operation_On_Map operationOnMap = new Operation_On_Map();
        Map map = operationOnMap.getMap();
        System.out.println("How many university departments are there?");
        operationOnMap.Qus_A(map);
        System.out.println("How many programs are delivered by the Computing department?");
        operationOnMap.Qus_B(map);
        System.out.println("How many students are enrolled in the Civil Engineering program?");
        operationOnMap.Qus_C(map);

    }

    public void Qus_A(Map map) {
        System.out.println(map.entrySet().stream().distinct().count());
    }

    public void Qus_B(Map map) {
        Set<Map.Entry> results = map.entrySet();
        Map computingMap = (Map) map.get("Computing");
        Set<Map.Entry> computing = computingMap.entrySet();
        System.out.println(computing.stream().distinct().count());
    }

    public void Qus_C(Map map) {
        Map engineeringMap = (Map) map.get("Engineering");
        Set<Map.Entry> results = engineeringMap.entrySet();
        System.out.println(results.stream().filter(it -> it.getKey() == "Civil").map(it -> it.getValue()).findFirst().get());

    }

    public Map getMap() {
        Map<String, Map> map = new HashMap<String, Map>();

        Map<String, Integer> Computing = new HashMap<String, Integer>();
        Computing.put("Computing", 600);
        Computing.put("Information Systems", 300);
        map.put("Computing", Computing);

        Map<String, Integer> engineering = new HashMap<String, Integer>();
        engineering.put("Civil", 200);
        engineering.put("Mechanical", 100);
        map.put("Engineering", engineering);

        Map<String, Integer> management = new HashMap<String, Integer>();
        engineering.put("Management", 800);
        map.put("Management", management);

        return map;
    }
}
