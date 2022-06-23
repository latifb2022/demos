package com.lbenzzine.exceptions;
/* created by lbenzzine on 6/23/22*/

public class UncheckedExceptions {
    public static void main(String[] args) {
        int x = 0 ;
        int y = 7;
        int z = y/x;

        //this statement won't be reached
        System.out.println("the division by 0 will not be caught at compile time but at runtime");
    }
}
