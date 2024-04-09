package org.ducksimulator;

import org.ducksimulator.model.*;
import org.ducksimulator.service.DuckSimulator;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Duck mallarDuck = new MallarDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck rubberDuck = new RubberDuck();
        Duck decoyDuck = new DecoyDuck();
        Duck mandarinDuck = new MandarinDuck();

        List<Duck> ducks = List.of(mallarDuck, redHeadDuck, rubberDuck, decoyDuck, mandarinDuck);

        DuckSimulator.processDuck(ducks);
    }
}
