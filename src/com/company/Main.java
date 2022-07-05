package com.company;

public class Main {

    public static void main(String[] args) {
        try (Car car = new Car()){
            throw new Error("It's an Error");
        } catch (Error | Exception e) {
            System.out.println(e.getMessage());
            Car.drive();
        }
    }
}
