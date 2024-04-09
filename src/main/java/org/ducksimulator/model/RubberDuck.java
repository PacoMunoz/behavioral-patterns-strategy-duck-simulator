package org.ducksimulator.model;

import org.ducksimulator.model.behavior.eat.CantEat;
import org.ducksimulator.model.behavior.fly.CantFly;
import org.ducksimulator.model.behavior.quack.Quakable;
import org.ducksimulator.model.behavior.quack.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new Squeak(), new CantFly(), new CantEat());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
