package org.ducksimulator.model.behavior.eat;

public class Hervivorous implements Diet {
    @Override
    public void eat() {
        System.out.println("Consume plants");
    }
}
