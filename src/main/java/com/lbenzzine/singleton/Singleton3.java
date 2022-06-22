package com.lbenzzine.singleton;
/* created by lbenzzine on 6/22/22*/

// Singleton with static factory
public class Singleton3 {
    private static Singleton3 INSTANCE;
    private Singleton3()
    {
        if (INSTANCE != null){
            throw new IllegalStateException();
        }
    }
    //static factory method
    public static Singleton3 getInstance(){
        if(INSTANCE == null) {
           INSTANCE = new Singleton3();
        }
        return INSTANCE;
    }
    public static void main(String[] args) {
        Singleton3 x = Singleton3.getInstance();
        Singleton3 y = Singleton3.getInstance();
        //x and y will have same hashcode value as they are pointing to the same instance in the heap
        System.out.println("hashcode of x is " + x.hashCode());
        System.out.println("hashcode of y is " + y.hashCode());
    }
}

