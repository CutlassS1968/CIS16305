package Lab2;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleCLassTest {

    @Test
    public void constructor() {
        SimpleCLass s = new SimpleCLass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void testToString() {
        SimpleCLass s = new SimpleCLass(2);
        assertEquals(2, s.getValue());
    }

    @Test
    public void incr() {
        SimpleCLass s = new SimpleCLass(2);
        for (int i = 0; i < 100; i++)
            s.incr();
        assertEquals(101, s.getValue());
    }

    @Test
    public void getValue() {
        SimpleCLass s = new SimpleCLass(20);
        assertEquals(20, s.getValue());
    }

    @Test
    public void setValue() {
        SimpleCLass s = new SimpleCLass(20);
        s.setValue(10);
        assertEquals(10, s.getValue());
    }

    @Test
    public void staticTest () {
        // your code goes here
    }
}