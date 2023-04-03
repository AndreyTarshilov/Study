package org.stepic.java.Lesson4_2.RemoteMoveRobot;

public abstract class MoveRobot implements RobotConnection {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        int tryCount = 0;
        boolean done = false;

        for (tryCount =0; tryCount<3 && !done; tryCount++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                done = true;
            } catch (RobotConnectionException e) {
            }
        }

        if (!done) {
            throw new RobotConnectionException("Connection failed after 3 attempts.");
        }
    }
}
