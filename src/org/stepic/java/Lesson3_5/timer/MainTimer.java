package org.stepic.java.Lesson3_5.timer;
import java.math.BigDecimal;

public class MainTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        long time = timer.measureTime(MainTimer::bigDecimalPower);
        System.out.println(time);
    }
    private static void bigDecimalPower()  {
        new BigDecimal("1234567").pow(100000);
    }
}
