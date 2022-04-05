package lab4.reflection;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {

        MyAnyCustomClass myAnyCustomClass=new MyAnyCustomClass("qwqw", 1212);

        System.out.println(get(myAnyCustomClass, "field1"));

    }

    private static Object get(Object object, String fieldName) {
        Class myClass=object.getClass();

        try {
            Field f= myClass.getDeclaredField(fieldName);
            f.setAccessible(true);
            return f.get(object);
        } catch (IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        return null;
    }
}
