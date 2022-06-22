package com.lbenzzine.staticFactoryMethod;
/* created by lbenzzine on 6/22/22*/

public final class SFMethodExample {

    private float real;
    private float imaginary;
    //Static factory method returns an object of this class
    public static SFMethodExample valueOf(float real, float imaginary)
    {
        return new SFMethodExample(real, imaginary);
    }

    //private constructor
    private SFMethodExample(float real, float imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImaginary() {
        return imaginary;
    }

    public void setImaginary(float imaginary) {
        this.imaginary = imaginary;
    }

    @Override
    public String toString() {
        return "SFMethodExample {" +
                " real = " + real +
                ", imaginary = " + imaginary + "i " +
                '}';
    }

    public static void main(String[] args) {
        SFMethodExample example = SFMethodExample.valueOf(2, 4);
        System.out.println(example.toString());
    }
}
