package org.example.model;

import org.example.model.behavior.FlyWithWinds;
import org.example.model.behavior.Flyable;
import org.example.model.behavior.Quack;
import org.example.model.behavior.Quakable;

public class RedHeadDuck extends Duck implements Flyable, Quakable {
    public RedHeadDuck() {
        super(new Quack(), new FlyWithWinds());
    }

    @Override
    public void display() {
        System.out.println("I'm a red head duck");
    }
}
