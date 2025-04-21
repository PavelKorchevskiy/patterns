package by.pattern.creational.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BigObjectTest {

    @Test
    public void builder_returns_same_object_as_constructor_test() {
        BigObject constructorInstance =
                new BigObject(false,
                        false,
                        1,
                        1,
                        "string",
                        "string",
                        "string",
                        "string",
                        "string",
                        "string",
                        "string",
                        "string");
        BigObject.Builder builder = new BigObject.Builder("string", "string")
                .setAvailable(false)
                .setDeleted(false)
                .setQuantity(1)
                .setPriceInCents(1)
                .setImage("string")
                .setPrice("string")
                .setColor("string")
                .setDescription("string")
                .setSize("string")
                .setType("string");
        BigObject builderInstance = new BigObject(builder);
        assertEquals(constructorInstance, builderInstance);
    }
}
