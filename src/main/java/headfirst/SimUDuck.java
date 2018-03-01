package headfirst;

import headfirst.ducks.Duck;
import headfirst.ducks.MallardDuck;
import headfirst.ducks.RedheadDuck;

import java.util.Arrays;
import java.util.List;

public class SimUDuck {
    public static void main(String[] args) {
        List<Duck> ducks = Arrays.asList(new MallardDuck(), new RedheadDuck());
        for (Duck duck : ducks) {
            System.out.println("***");
            System.out.println(duck.display());
            System.out.println(duck.quack());
            System.out.println(duck.swim());
        }

    }
}
