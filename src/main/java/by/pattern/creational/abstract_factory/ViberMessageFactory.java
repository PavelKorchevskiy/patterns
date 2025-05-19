package by.pattern.creational.abstract_factory;

public class ViberMessageFactory implements MessageFactory {
    @Override
    public Photo createPhoto() {
        return new ViberPhoto();
    }

    @Override
    public Poll createPoll() {
        return new ViberPoll();
    }

    @Override
    public Post createPost() {
        return new ViberPost();
    }
}
