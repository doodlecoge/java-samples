package me.hch.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by hch on 2014/5/3.
 *
 * Accessing Private Members is almost same as
 * accessing public members with only one exception,
 * you need to call member.setAccessible(true) to
 * allow accessing to it from outside class.
 */
public class AccessPrivateMember {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        TheClass theObj = new TheClass();

        // set value for private field
        Field field = TheClass.class.getDeclaredField("thePrivateField");
        field.setAccessible(true); // make private field accessible from outside the class
        field.set(theObj, "value set for the thePrivateField from outside");
        System.out.println(theObj.getThePrivateField());

        // invoke private method
        Method method = TheClass.class.getDeclaredMethod("privateMethod", String.class);
        method.setAccessible(true);
        Object value = method.invoke(theObj, "the argument value");
        System.out.println(value);

    }
}
