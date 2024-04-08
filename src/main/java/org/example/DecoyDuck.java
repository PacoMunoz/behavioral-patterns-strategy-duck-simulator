package org.example;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super(new Silence(), new CantFly());
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
