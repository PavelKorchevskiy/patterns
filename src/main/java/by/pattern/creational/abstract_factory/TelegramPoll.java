package by.pattern.creational.abstract_factory;

import java.util.Map;

public class TelegramPoll implements Poll {

    private Map<Long, String> pollData;
    private String title;

    @Override
    public Map<Long, String> getPollData() {
        return pollData;
    }
}
