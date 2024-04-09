package org.ducksimulator.model.behavior.quack;

public class Squeak implements Quakable{
    @Override
    public void quack() {
        System.out.println("Squeak squeak squeak");
    }
}
