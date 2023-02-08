package org.stepic.java.timer;

public class Timer {
    public long measureTime(Runnable runnable) {
        long StartTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis();
    }
}
