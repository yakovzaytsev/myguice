package io.ysz.myguice;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FortuneServiceImpl implements FortuneService {
    private static final List<String> MESSAGES =
            Arrays.asList(
                    "Today you will have some refreshing juice.",
                    "Larry just bought your company"
            );

    @Override
    public String randomFortune() {
        return MESSAGES.get(new Random().nextInt(MESSAGES.size()));
    }
}
