package org.ducksimulator.model.behavior.quack;

public class Silence implements Quakable {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
