package org.ducksimulator.model;

import org.ducksimulator.model.behavior.eat.CantEat;
import org.ducksimulator.model.behavior.fly.CantFly;
import org.ducksimulator.model.behavior.quack.Silence;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new Silence(), new CantFly(), new CantEat());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
