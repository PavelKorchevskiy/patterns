package by.pattern.creational.abstract_factory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ViberPoll implements Poll{
    private List<String> pollData;

    @Override
    public Map<Long, String> getPollData() {
        return IntStream.range(0, pollData.size())
                .boxed()
                .collect(Collectors.toMap(
                        i -> (long) i,
                        pollData::get
                ));
    }
}
