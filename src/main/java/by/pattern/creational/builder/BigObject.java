package by.pattern.creational.builder;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BigObject bigObject = (BigObject) o;
        return quantity == bigObject.quantity && priceInCents == bigObject.priceInCents && available == bigObject.available && deleted == bigObject.deleted && Objects.equals(id, bigObject.id) && Objects.equals(name, bigObject.name) && Objects.equals(description, bigObject.description) && Objects.equals(type, bigObject.type) && Objects.equals(color, bigObject.color) && Objects.equals(size, bigObject.size) && Objects.equals(price, bigObject.price) && Objects.equals(image, bigObject.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, type, color, size, price, image, quantity, priceInCents, available, deleted);
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

        public Builder setPriceInCents(int priceInCents) {
            this.priceInCents = priceInCents;
            return this;
        }

        public Builder setImage(String image) {
            this.image = image;
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
