package dev.trly.java.example.primitive.wrappers;

public final class LaunchChecklistApp {
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
            System.out.printf("%s: %s%n", steps[index], status);
            if (ready) {
                readyCount++;
            }
        }

        System.out.printf("Summary: %d of %d steps are ready%n", readyCount, readiness.length);
    }
}
