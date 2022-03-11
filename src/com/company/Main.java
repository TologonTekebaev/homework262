package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<City> cities = new HashSet<>();
        cities.add(new City(29, "Argentina"));
        cities.add(new City(312, "USA"));
        cities.add(new City(81, "Japan"));
        cities.add(new City(41, "Switzerland"));

        Set<City> cities1 = new TreeSet<>(cities);
        for (City city : cities1) {
            if (city.getCode()%2!=0) {
                System.out.println(city);
            }
        }
    }
}

      /*City деген класс тузунуз. (code, name, ...)
        Эгерде code так сан болсо TreeSetke салыныз.
        Аларды чонунан кичинесине караган тартипте чыгарыныз.*/
