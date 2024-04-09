package org.ducksimulator.model.behavior.eat;

public class CantEat implements Diet {
    @Override
    public void eat() {
        System.out.println("I can't eat");
    }
}
