package com.company;

public class Car extends Throwable implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("The car is going to close");
    }
    public static void drive() {
        System.out.println("The car is going");
    }
}
