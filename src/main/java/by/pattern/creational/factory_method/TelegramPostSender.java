package by.pattern.creational.factory_method;

public class TelegramPostSender extends PostSender {

    @Override
    public Post createPost() {
        return new TelegramPost();
    }
}
