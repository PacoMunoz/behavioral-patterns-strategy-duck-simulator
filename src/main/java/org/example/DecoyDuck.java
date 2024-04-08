package org.example;

public class DecoyDuck extends Duck {
    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }

    @Override
    public void fly() {
    }

    @Override
    public void quack() {
    }
}
