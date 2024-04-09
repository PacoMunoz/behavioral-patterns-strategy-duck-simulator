package org.ducksimulator.model.behavior.eat;

public class Piscivorous implements Diet {
    @Override
    public void eat() {
        System.out.println("Consume fish");
    }
}
