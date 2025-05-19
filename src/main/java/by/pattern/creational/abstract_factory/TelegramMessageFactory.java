package by.pattern.creational.abstract_factory;

public class TelegramMessageFactory implements MessageFactory {
    @Override
    public Photo createPhoto() {
        return new TelegramPhoto(new byte[0]);
    }

    @Override
    public Poll createPoll() {
        return new TelegramPoll();
    }

    @Override
    public Post createPost() {
        return new TelegramPost();
    }
}
