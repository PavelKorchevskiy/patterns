package by.pattern.creational.factory_method;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostSenderTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void telegram_post_sender_test() {
        TelegramPostSender telegramPostSender = new TelegramPostSender();
        telegramPostSender.send();
        assertEquals("Telegram post for 0 subscribers\n", outputStream.toString());
    }

    @Test
    public void facebook_post_sender_test() {
        FacebookPostSender facebookPostSender = new FacebookPostSender();
        facebookPostSender.send();
        assertEquals("Facebook post for 0 followers", outputStream.toString());
    }
}
