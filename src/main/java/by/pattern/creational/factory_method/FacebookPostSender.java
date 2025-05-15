package by.pattern.creational.factory_method;

public class FacebookPostSender extends PostSender {

    @Override
    public Post createPost() {
        return new FacebookPost();
    }
}
