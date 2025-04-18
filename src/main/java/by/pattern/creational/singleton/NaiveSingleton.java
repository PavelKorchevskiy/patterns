package by.pattern.creational.singleton;

public final class NaiveSingleton {

    private static NaiveSingleton instance = new NaiveSingleton();

    private NaiveSingleton() {
    }

    public static NaiveSingleton getInstance() {
        if (instance == null) {
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
