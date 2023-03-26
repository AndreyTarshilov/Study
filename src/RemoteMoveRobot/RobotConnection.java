package RemoteMoveRobot;

public interface RobotConnection extends AutoCloseable{
    void moveRobotTo(int x, int y);
    @Override
    void close();
}
