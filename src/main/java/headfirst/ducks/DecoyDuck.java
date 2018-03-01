package headfirst.ducks;

public class DecoyDuck extends Duck {
    @Override
    public String display() {
        return "I'm a decoy duck";
    }

    @Override
    public String quack() {
        return "-- mute --";
    }

    @Override
    public String swim() {
        return "-- I can't swim --";
    }
}
