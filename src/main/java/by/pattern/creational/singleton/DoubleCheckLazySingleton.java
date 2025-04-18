package by.pattern.creational.singleton;

public final class DoubleCheckLazySingleton {

    private static volatile DoubleCheckLazySingleton instance;

    public static DoubleCheckLazySingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckLazySingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckLazySingleton();
                }
            }
        }
        return instance;
    }

    private DoubleCheckLazySingleton() {}
}
