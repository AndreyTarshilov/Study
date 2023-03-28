package RemoteMoveRobot;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        RobotConnectionException mistakeOfConnection = new RobotConnectionException("Another exception");
        RobotConnectionException mistakeSetUpOfConnection = new RobotConnectionException("Another exception", null); // or getCause() instead null
        /* try { throw RuntimeException anotherException = new IOException("Another exception");
        }
        catch (Exception e) {} */
    }

}
