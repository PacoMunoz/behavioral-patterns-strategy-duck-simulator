package org.example;

public class RedHeadDuck extends Duck implements Flyable, Quakable{
    public RedHeadDuck() {
        super(new Quack(), new FlyWithWinds());
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
