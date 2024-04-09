package org.example.model;

import org.example.model.behavior.CantFly;
import org.example.model.behavior.Quakable;
import org.example.model.behavior.Squeak;

public class RubberDuck extends Duck implements Quakable {
    public RubberDuck() {
        super(new Squeak(), new CantFly());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
