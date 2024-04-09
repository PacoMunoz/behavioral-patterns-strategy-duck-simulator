package org.example.model;

import org.example.model.behavior.Flyable;
import org.example.model.behavior.Quakable;

public class Duck {
    private final Quakable quakable;
    private final Flyable flyable;

    public Duck(Quakable quakable, Flyable flyable) {
        this.quakable = quakable;
        this.flyable = flyable;
    }

    public void swim() {
        System.out.println("Swim swim swim");
    }
    public void display(){}
    public void quack() {
        quakable.quack();
    }
    public void fly() {
        flyable.fly();
    }
}
