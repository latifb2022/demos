package com.lbenzzine.singleton;
/* created by lbenzzine on 6/22/22*/

//A singleton is simply a class that is instantiated exactly once
//Singleton with public final field
public class Singleton {
    public static final Singleton INSTANCE = new Singleton();

    private Singleton() {};

    public static void main(String[] args) {
        Singleton x = Singleton.INSTANCE;
        Singleton y = Singleton.INSTANCE;
        //x and y will have same hashcode value as they are pointing to the same instance in the heap
        System.out.println("hashcode of x is " + x.hashCode());
        System.out.println("hashcode of y is " + y.hashCode());
    }


}
