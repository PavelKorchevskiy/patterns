package by.pattern.creational.abstract_factory;

public class TelegramPhoto implements Photo {

    private final byte[] photo;
    private String photoName;

    @Override
    public byte[] getBytes() {
        return photo;
    }

    public TelegramPhoto(byte[] photo) {
        this.photo = photo;
    }
}
