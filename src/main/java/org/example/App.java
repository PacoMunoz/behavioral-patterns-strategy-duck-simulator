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
        MallarDuck mallarDuck = new MallarDuck();
        RedHeadDuck redHeadDuck = new RedHeadDuck();
        RubberDuck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();

        List<Duck> ducks = List.of(mallarDuck, redHeadDuck, rubberDuck, decoyDuck);

        ducks.forEach(duck -> {
            duck.display();
            duck.swim();
        });


        List<Flyable> flyableDucks = List.of(redHeadDuck, mallarDuck);

        flyableDucks.forEach(Flyable::fly);

        List<Quakable> quakablesDucks = List.of(mallarDuck, redHeadDuck, rubberDuck);

        quakablesDucks.forEach(Quakable::quack);

    }
}
