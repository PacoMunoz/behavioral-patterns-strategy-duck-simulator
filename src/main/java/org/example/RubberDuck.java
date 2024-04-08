package org.example;

public class RubberDuck extends Duck implements Quakable{
    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeak squeak squeak");
    }
}
