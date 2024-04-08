package org.example;

public class MallarDuck extends Duck implements Flyable, Quakable {
    public MallarDuck() {
        super(new Quack(), new FlyWithWinds());
    }

    @Override
    public void display() {
        System.out.println("I'm a mallar duck");
    }
}
