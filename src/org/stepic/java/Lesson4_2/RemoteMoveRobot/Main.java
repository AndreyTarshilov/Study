package org.stepic.java.Lesson4_2.RemoteMoveRobot;

import java.util.logging.Logger;

public class Main {
    private static final Logger log = Logger.getLogger("RobotLoger");

    public static void main(String[] args) {
        RobotConnectionException mistakeSetUpOfConnection = new RobotConnectionException("Another exception", null); // or getCause() instead null

        RobotConnectionManager manager = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return new MoveRobot.RobotConnectionImpl(1);
            }
        };
        MoveRobot robot = new MoveRobot();
        robot.moveRobot(manager, 1, 1);
    }


}
