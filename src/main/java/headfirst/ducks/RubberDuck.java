package headfirst.ducks;

public class RubberDuck extends Duck {
    @Override
    public String display() {
        return "I'm a rubber duck";
    }

    @Override
    public String quack() {
        return "Squeak!";
    }

    @Override
    public String swim() {
        return "-- I can't swim";
    }
}
