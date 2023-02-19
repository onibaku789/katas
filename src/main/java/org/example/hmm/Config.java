package org.example.hmm;

import java.time.Instant;

public class Config {
    public final static TimeProvider timeProvider = new TimeProvider();

    public final static Module MODULE_1 = new Module("First Module", timeProvider);
    public final static Module MODULE_2 = new Module("Second module", timeProvider);

    public void init() {
        timeProvider.setStartTime(Instant.now());
    }
}
