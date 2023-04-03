package org.stepic.java.Lesson4_2.RemoteMoveRobot;

public class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }
    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
