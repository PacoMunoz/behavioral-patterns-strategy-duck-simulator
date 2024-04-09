package org.ducksimulator.model;

import org.ducksimulator.model.behavior.eat.Diet;
import org.ducksimulator.model.behavior.fly.Flyable;
import org.ducksimulator.model.behavior.quack.Quakable;

public class Duck {
    private final Quakable quakable;
    private final Flyable flyable;
    private final Diet diet;

    public Duck(Quakable quakable, Flyable flyable, Diet diet) {
        this.quakable = quakable;
        this.flyable = flyable;
        this.diet = diet;
    }

    public void swim() {
        System.out.println("Swim swim swim");
    }
    public void display() {
        System.out.println("I'm a duck");
    }
    public void quack() {
        quakable.quack();
    }
    public void fly() {
        flyable.fly();
    }
    public void eat() {
        diet.eat();
    }
}
