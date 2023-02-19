package org.example.hmm;

import lombok.extern.slf4j.Slf4j;

import java.time.Instant;

@Slf4j
public class TimeProvider {
    private Instant startTime;

    public TimeProvider() {
    }


    public Instant getStartTime() {
        log.info("Get current time: {}", startTime);
        return startTime;
    }

    public void setStartTime(Instant startTime) {
        log.info("Time set to current instant: {}", startTime);
        this.startTime = startTime;
    }
}
