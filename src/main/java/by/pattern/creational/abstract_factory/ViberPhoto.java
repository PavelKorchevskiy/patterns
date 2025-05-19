package by.pattern.creational.abstract_factory;

public class ViberPhoto implements Photo {

    private byte[] photo;
    private String photoName;

    @Override
    public byte[] getBytes() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }
    public String getPhotoName() {
        return photoName;
    }
}
