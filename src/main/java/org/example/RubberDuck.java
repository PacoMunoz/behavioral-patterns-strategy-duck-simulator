package org.example;

public class RubberDuck extends Duck{
    @Override
    public void quack() {
        System.out.println("Squeak squeak squeak");
    }

    @Override
    public void fly() {

    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
