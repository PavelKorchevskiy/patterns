package by.pattern.creational.factory_method;

public class TelegramPost implements Post{

    private long subscribersCount;

    @Override
    public void post() {
        System.out.printf("Telegram post for %d subscribers\n", subscribersCount);
    }
}
