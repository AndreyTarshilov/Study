package org.stepic.java.Lesson4_2.RemoteMoveRobot;

public class Main {

    public static void main(String[] args) {

        //RobotConnectionException mistakeOfConnection = new RobotConnectionException("Another exception");
        RobotConnectionException mistakeSetUpOfConnection = new RobotConnectionException("Another exception", null); // or getCause() instead null
        //mistakeSetUpOfConnection.
        // MoveRobot.moveRobot(("Good connection"), 3,4);
        /* try { throw RuntimeException anotherException = new IOException("Another exception");
        }
        catch (Exception e) {} */
    }


}
