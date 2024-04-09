package org.example.model.behavior;

public class CantFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
