package org.ducksimulator.model;

import org.ducksimulator.model.behavior.eat.Piscivorous;
import org.ducksimulator.model.behavior.fly.FlyWithWinds;
import org.ducksimulator.model.behavior.fly.Flyable;
import org.ducksimulator.model.behavior.quack.Quack;
import org.ducksimulator.model.behavior.quack.Quakable;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new Quack(), new FlyWithWinds(), new Piscivorous());
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
