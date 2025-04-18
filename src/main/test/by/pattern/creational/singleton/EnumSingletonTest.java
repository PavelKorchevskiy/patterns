package by.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class EnumSingletonTest {

    @Test
    public void instance_not_null_test() {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        assertNotNull(instance);
    }

    @Test
    public void same_instance_test() {
        EnumSingleton instanceOne = EnumSingleton.INSTANCE;
        EnumSingleton instanceTwo = EnumSingleton.INSTANCE;
        assertSame(instanceOne, instanceTwo);
    }
}
