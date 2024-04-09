package org.ducksimulator.model;

import org.ducksimulator.model.behavior.eat.Omnivorous;
import org.ducksimulator.model.behavior.fly.FlyWithWinds;
import org.ducksimulator.model.behavior.fly.Flyable;
import org.ducksimulator.model.behavior.quack.Quack;
import org.ducksimulator.model.behavior.quack.Quakable;

public class MallarDuck extends Duck {
    public MallarDuck() {
        super(new Quack(), new FlyWithWinds(), new Omnivorous());
    }

    @Override
    public void display() {
        System.out.println("I'm a mallar duck");
    }
}
