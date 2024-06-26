package org.ducksimulator.service;

import org.ducksimulator.model.Duck;

import java.util.List;

public class DuckSimulator {
    public static void processDuck(List<Duck> ducks) {
        ducks.forEach(duck -> {
            System.out.println("------------------");
            System.out.println("Name: " + duck.getClass().getName());
            duck.display();
            duck.fly();
            duck.swim();
            duck.quack();
            duck.eat();
        });
    }
}
