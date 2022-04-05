package lab4.generic;

import lab4.reflection.MyAnyCustomClass;

import java.util.Comparator;

public class PersonComparationByField3 implements Comparator<MyAnyCustomClass> {
    public int compare(MyAnyCustomClass o1, MyAnyCustomClass o2){
        return o1.getField3().compareTo(o2.getField3());
    }


}
