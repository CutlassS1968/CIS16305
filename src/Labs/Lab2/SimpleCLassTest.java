package Labs.Lab2;
// test class
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
        SimpleCLass s = new SimpleCLass(1);
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
        SimpleCLass s = new SimpleCLass(2);
        s.setValue(10);
        assertEquals(10, s.getValue());
    }

    @Test
    public void staticTest () {
        SimpleCLass.setNumberOfInst(0);
        SimpleCLass s1 = new SimpleCLass(1);
        SimpleCLass s2 = new SimpleCLass(2);
        SimpleCLass s3 = new SimpleCLass(3);
        SimpleCLass s4 = new SimpleCLass(4);
        assertEquals(4,SimpleCLass.getNumberOfInst());
    }
}