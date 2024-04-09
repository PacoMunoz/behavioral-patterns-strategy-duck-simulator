package org.example.model;

import org.example.model.behavior.CantFly;
import org.example.model.behavior.Silence;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new Silence(), new CantFly());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
