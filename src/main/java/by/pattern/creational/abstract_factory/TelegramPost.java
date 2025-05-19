package by.pattern.creational.abstract_factory;

public class TelegramPost implements Post {

    private String text;

    @Override
    public String getSummary() {
        return text.substring(0, text.indexOf("."));
    }
}
