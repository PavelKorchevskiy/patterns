package by.pattern.creational.builder;

public class BigObject {

    private String id;  //necessary
    private String name;    //necessary
    private String description;
    private String type;
    private String color;
    private String size;
    private String price;
    private String image;
    private int quantity;
    private int priceInCents;
    private boolean available;
    private boolean deleted;

    public BigObject(boolean deleted, boolean available, int priceInCents, int quantity, String image, String price, String size, String color, String type, String description, String name, String id) {
        this.deleted = deleted;
        this.available = available;
        this.priceInCents = priceInCents;
        this.quantity = quantity;
        this.image = image;
        this.price = price;
        this.size = size;
        this.color = color;
        this.type = type;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public BigObject(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.description = builder.description;
        this.type = builder.type;
        this.color = builder.color;
        this.size = builder.size;
        this.price = builder.price;
        this.quantity = builder.quantity;
        this.priceInCents = builder.priceInCents;
        this.available = builder.available;
        this.deleted = builder.deleted;
        this.image = builder.image;

    }

    public static class Builder {
        private String id;
        private String name;
        private String description;
        private String type;
        private String color;
        private String size;
        private String price;
        private String image;
        private int quantity;
        private int priceInCents;
        private boolean available;
        private boolean deleted;

        public Builder(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setSize(String size) {
            this.size = size;
            return this;
        }

        public Builder setPrice(String price) {
            this.price = price;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder setAvailable(boolean available) {
            this.available = available;
            return this;
        }

        public Builder setDeleted(boolean deleted) {
            this.deleted = deleted;
            return this;
        }
        public BigObject build() {
            return new BigObject(this);
        }
    }
}
