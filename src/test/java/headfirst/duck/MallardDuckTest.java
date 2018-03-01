package headfirst.duck;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MallardDuckTest {
    @Test
    public void quack() {
        assertThat(new MallardDuck().quack(), is("Quack!"));
    }
    @Test
    public void swim() {
        assertThat(new MallardDuck().swim(), is("Splish splash ..."));
    }
    @Test
    public void display() {
        assertThat(new MallardDuck().display(), is("I'm a mallard duck"));
    }
}
