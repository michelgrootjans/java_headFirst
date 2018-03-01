package headfirst.duck;

public abstract class Duck {
    public String quack() {
        return "Quack!";
    }

    public String swim() {
        return "Splish splash ...";
    }

    public abstract String display();
}
