package RemoteMoveRobot;

import org.stepic.java.Lesson3_5.exstatic.ExStatic;

import java.io.IOException;

public class RobotConnectionException extends RuntimeException {
    public RobotConnectionException(String message) {
        super(message);
    }
    public RobotConnectionException(String message, Throwable cause) {
        super(message, cause);
    }

}
