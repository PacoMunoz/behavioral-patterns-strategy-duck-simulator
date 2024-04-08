package org.example;

public class RubberDuck extends Duck implements Quakable{
    public RubberDuck() {
        super(new Squeak(), new CantFly());
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
