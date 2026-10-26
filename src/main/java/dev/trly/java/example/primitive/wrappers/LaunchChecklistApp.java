package dev.trly.java.example.primitive.wrappers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class LaunchChecklistApp {
    private static final Logger LOGGER = LoggerFactory.getLogger(LaunchChecklistApp.class);

    private LaunchChecklistApp() {
    }

    public static void main(String[] args) {
        final String[] steps = {
            "power",
            "network",
            "storage",
            "alerts"
        };
        final Boolean[] readiness = {
            Boolean.valueOf(true),
            Boolean.valueOf(true),
            Boolean.valueOf(false),
            Boolean.valueOf(true)
        };

        int readyCount = 0;
        for (int index = 0; index < readiness.length; index++) {
            final boolean ready = readiness[index].booleanValue();
            final String status = ready ? "ready" : "waiting";
            LOGGER.info("{}: {}", steps[index], status);
            if (ready) {
                readyCount++;
            }
        }

        LOGGER.info("Summary: {} of {} steps are ready", readyCount, readiness.length);
    }
}
