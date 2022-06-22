package com.lbenzzine.singleton;
/* created by lbenzzine on 6/22/22*/

// Singleton with static factory
public class Singleton2 {

    private static final Singleton2 INSTANCE = new Singleton2();

    private Singleton2(){}
    //static factory method
    public static Singleton2 getInstance(){ return INSTANCE; }
    public static void main(String[] args) {
        Singleton2 x = Singleton2.getInstance();
        Singleton2 y = Singleton2.getInstance();
        //x and y will have same hashcode value as they are pointing to the same instance in the heap
        System.out.println("hashcode of x is " + x.hashCode());
        System.out.println("hashcode of y is " + y.hashCode());
    }
}
