package lab4.generic;

import lab4.reflection.MyAnyCustomClass;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<MyAnyCustomClass> list = new ArrayList<>(Arrays.asList(
                new MyAnyCustomClass("qwqw", 1212),
            new MyAnyCustomClass("erer", 3434),
            new MyAnyCustomClass("tyty", 5656)
        ));
        System.out.println(list);

        System.out.println(max(list, new PersonComparatorByField2()));
    }

    private static Object max(List<MyAnyCustomClass> list, Comparator<MyAnyCustomClass> personComparatorByField2) {
        return Collections.max(list, personComparatorByField2);

    }
}
