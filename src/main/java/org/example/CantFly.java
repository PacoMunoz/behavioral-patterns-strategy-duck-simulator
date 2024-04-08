package org.example;

public class CantFly implements Flyable{
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
