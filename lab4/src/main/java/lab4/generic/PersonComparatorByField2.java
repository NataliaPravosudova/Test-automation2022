package lab4.generic;

import lab4.reflection.MyAnyCustomClass;

import java.util.Comparator;

public class PersonComparatorByField2 implements Comparator<MyAnyCustomClass> {

    public int compare(MyAnyCustomClass o1, MyAnyCustomClass o2){
        return o1.getField2().compareTo(o2.getField2());
    }

}
