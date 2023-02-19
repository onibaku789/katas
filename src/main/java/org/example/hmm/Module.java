package org.example.hmm;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

@Slf4j
public class Module {
    private final String name;
    private final TimeProvider provider;

    public Module(String name, TimeProvider provider) {
        this.name = name;
        this.provider = provider;
    }

    @SneakyThrows
    public void doCommand() {
        Instant startTime = provider.getStartTime();
        log.info("{} was called with {} time", name, startTime);

    }
}
