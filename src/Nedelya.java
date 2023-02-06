/* This program is necessary for testing a special class called Enumeration (enum) */
public class Nedelya {
    public enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    public static void main(String[] args) {
        for (java.time.DayOfWeek day : java.time.DayOfWeek.values()) {
            System.out.println (day.ordinal() + " " + day.name());
        }
    }
}

/*
1. ordinal() returns a number - the ordinal number of the element, starting from 0 according to the declaration in the source code.
2. The method returns the string name of the variable calculation as in the source code.
*/


