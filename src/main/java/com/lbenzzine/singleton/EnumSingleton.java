package com.lbenzzine.singleton;
/* created by lbenzzine on 6/22/22*/

//The recommended approach for implementing singletons is to construct an enum type with one element:
public enum EnumSingleton {
    INSTANCE;

    public static void main(String[] args) {
        EnumSingleton x = EnumSingleton.INSTANCE;
        EnumSingleton y = EnumSingleton.INSTANCE;
        //x and y will have same hashcode value as they are pointing to the same instance in the heap
        System.out.println("hashcode of x is " + x.hashCode());
        System.out.println("hashcode of y is " + y.hashCode());
    }
}
