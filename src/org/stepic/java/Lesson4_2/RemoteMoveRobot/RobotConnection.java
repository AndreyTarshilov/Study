package org.stepic.java.Lesson4_2.RemoteMoveRobot;

public interface RobotConnection extends AutoCloseable{
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
