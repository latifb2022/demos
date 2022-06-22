package com.lbenzzine.singleton;
/* created by lbenzzine on 6/22/22*/

import java.io.Serializable;

public final class CompleteSingleton implements Serializable {
    private static final long serialVersionUID = 1L;
    // INSTANCE must be static and final to prevent later modification
    private static CompleteSingleton INSTANCE;

    // The constructor must be private to prevent another class instance
    private CompleteSingleton() {
        //to prevent invoking the private constructor reflectively
        // using the AccessibleObject.setAccessible() method, we should modify
        // the constructor to throw an exception if it’s asked to create a second instance:
        if (INSTANCE != null) {
            throw new IllegalStateException();
        }
    }

    // The public static method returns the same object reference every time
    public static CompleteSingleton getInstance() {
        //to make it trade safe so not every thread sees instance as null and creates
        //a new instance. we place the initialization inside a synchronized block
        synchronized (CompleteSingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new CompleteSingleton();
            }
        }
        return INSTANCE;
    }

    // readResolve method to preserve singleton property
    private Object readResolve() {
        // Return the one true singleton and let the garbage collector
        // take care of the singleton impersonator.
        return INSTANCE;
    }
}