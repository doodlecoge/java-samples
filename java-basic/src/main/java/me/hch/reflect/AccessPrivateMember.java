package me.hch.reflect;

import java.lang.reflect.Field;

/**
 * Created by hch on 2014/5/3.
 */
public class AccessPrivateMember {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        TheClass theObj = new TheClass();

        // set value for private field
        Field field = TheClass.class.getDeclaredField("thePrivateField");
        field.setAccessible(true); // make private field accessible from outside the class
        field.set(theObj, "value set for the thePrivateField from outside");
        System.out.println(theObj.getThePrivateField());
    }
}
