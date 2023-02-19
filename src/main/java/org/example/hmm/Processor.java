package org.example.hmm;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Processor {
    private static final Config config = new Config();
    private final int millis;

    public Processor(int millis) {
        this.millis = millis;
    }

    @SneakyThrows
    public void process() {
        log.info("waiting for %d and then will start the process".formatted(millis));
        Thread.sleep(millis/2);
        config.init();
        Thread.sleep(millis/2);
        List.of(Config.MODULE_1, Config.MODULE_2)
                .forEach(Module::doCommand);
    }
}
