package com.example;

import io.micronaut.scheduling.annotation.Scheduled;
import java.text.SimpleDateFormat;
import java.util.UUID;

import javax.inject.Singleton;

@Singleton
public class ScheduledJob {

    private static final String ID = "254ef6fd-0ff1-4d68-bd50-5e82843db874";

    private final DummyRepository dummyRepository;

    public ScheduledJob(DummyRepository dummyRepository) {
        this.dummyRepository = dummyRepository;
    }

    @Scheduled(fixedDelay = "1m", initialDelay = "5s")
    void repeatEveryMinute() {
        var dummyEntity = new DummyEntity(UUID.fromString(ID), null, "Bob");
        dummyRepository.save(dummyEntity);
    }
}
