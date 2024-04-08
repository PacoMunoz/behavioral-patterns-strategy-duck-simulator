package org.example;

public class Silence implements Quakable {
    @Override
    public void quack() {
        System.out.println("I can't quack");
    }
}
