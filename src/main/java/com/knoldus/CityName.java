package com.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CityName {
    public static void main(String[] args) {
        List<String> cities = Arrays.asList("Delhi", "Noida", "calicut", "cochi");
        System.out.println(cities.stream().map(city -> city.toUpperCase()).filter(city -> city.startsWith("C")).sorted().collect(Collectors.toList()));
    }
}
