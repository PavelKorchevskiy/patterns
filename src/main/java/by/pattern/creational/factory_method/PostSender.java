package by.pattern.creational.factory_method;

public abstract class PostSender {

    public void send() {
        Post post = createPost();
        post.post();
    }

    public abstract Post createPost();
}
