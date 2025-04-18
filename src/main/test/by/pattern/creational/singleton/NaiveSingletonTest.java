package by.pattern.creational.singleton;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class NaiveSingletonTest {

    @Test
    public void instance_not_null_test() {
        NaiveSingleton instance = NaiveSingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void same_instance_test() {
        NaiveSingleton instanceOne = NaiveSingleton.getInstance();
        NaiveSingleton instanceTwo = NaiveSingleton.getInstance();
        assertSame(instanceOne, instanceTwo);
    }
}
