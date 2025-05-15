package by.pattern.creational.factory_method;

public class FacebookPost implements Post {

    private long followersCount;

    @Override
    public void post() {
        System.out.printf("Facebook post for %d followers", followersCount);
    }
}
