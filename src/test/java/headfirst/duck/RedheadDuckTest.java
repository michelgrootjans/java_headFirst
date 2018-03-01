package headfirst.duck;

import headfirst.ducks.RedheadDuck;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class RedheadDuckTest {
    @Test
    public void quack() {
        assertThat(new RedheadDuck().quack(), is("Quack!"));
    }
    @Test
    public void swim() {
        assertThat(new RedheadDuck().swim(), is("Splish splash ..."));
    }
    @Test
    public void display() {
        assertThat(new RedheadDuck().display(), is("I'm a mallard duck"));
    }
}
