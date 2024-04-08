package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck mallarDuck = new MallarDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        List<Duck> ducks = List.of(mallarDuck, redHeadDuck, rubberDuck, decoyDuck);

        ducks.forEach(duck -> {
            duck.display();
            duck.swim();
            duck.quack();
            duck.fly();
        });
    }
}