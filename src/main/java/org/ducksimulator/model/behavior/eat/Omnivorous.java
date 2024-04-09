package org.ducksimulator.model.behavior.eat;

public class Omnivorous implements Diet {
    @Override
    public void eat() {
        System.out.println("Consume a variety of food");
    }
}
