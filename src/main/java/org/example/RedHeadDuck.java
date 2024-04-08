package org.example;

public class RedHeadDuck extends Duck implements Flyable, Quakable{
    @Override
    public void display() {
        System.out.println("I'm a red head duck");
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
