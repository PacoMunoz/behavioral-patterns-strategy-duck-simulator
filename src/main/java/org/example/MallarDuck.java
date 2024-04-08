package org.example;

public class MallarDuck extends Duck implements Flyable, Quakable {
    @Override
    public void display() {
        System.out.println("I'm a mallar duck");
    }

    @Override
    public void fly() {
        System.out.println("Fly fly fly");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack quack");
    }
}
