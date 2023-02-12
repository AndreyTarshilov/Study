package org.stepic.java.Lesson3_5.timer;

public class Timer {
    public long measureTime(Runnable runnable) {
        long StartTime = System.currentTimeMillis();
        runnable.run();
        return System.currentTimeMillis();
    }
}
