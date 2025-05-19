package by.pattern.creational.abstract_factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class MessageFactoryTest {

    private MessageFactory messageFactory;

    @Test
    void viber_message_factory_test() {
        messageFactory = new ViberMessageFactory();
        Post post = messageFactory.createPost();
        assertInstanceOf(ViberPost.class, post);
    }

    @Test
    void telegram_message_factory_test() {
        messageFactory = new TelegramMessageFactory();
        Photo photo = messageFactory.createPhoto();
        assertInstanceOf(TelegramPhoto.class, photo);
    }
}
