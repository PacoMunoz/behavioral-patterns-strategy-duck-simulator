package org.example.model.behavior;

public class Quack implements Quakable{
    @Override
    public void quack() {
        System.out.println("Quack quack quack");
    }
}
