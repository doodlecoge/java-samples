package me.hch.reflect;

/**
 * Created by hch on 2014/5/3.
 */
public class TheClass {
    private static String thePrivateStaticField;
    private static final String thePrivateStaticFinalField;
    private String thePrivateField;

    static {
        thePrivateStaticFinalField = "value of thePrivateStaticFinalField";
    }

    public String getThePrivateField() {
        return thePrivateField;
    }
}
