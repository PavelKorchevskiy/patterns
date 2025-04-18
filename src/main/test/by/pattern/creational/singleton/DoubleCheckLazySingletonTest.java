package by.pattern.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class DoubleCheckLazySingletonTest {

    @Test
    public void instance_not_null_test() {
        DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();
        assertNotNull(instance);
    }

    @Test
    public void same_instance_test() {
        DoubleCheckLazySingleton instanceOne = DoubleCheckLazySingleton.getInstance();
        DoubleCheckLazySingleton instanceTwo = DoubleCheckLazySingleton.getInstance();
        assertSame(instanceOne, instanceTwo);
    }

    @Test
    public void same_instance_multithread_test() {
        DoubleCheckLazySingleton[] instanceArray = new DoubleCheckLazySingleton[1];
        Runnable task = () -> {
            DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();
            if (instanceArray[0] == null) {
                instanceArray[0] = instance;
            } else {
                assertSame(instanceArray[0], instance);
            }
        };
        Thread[] threads = new Thread[30];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
