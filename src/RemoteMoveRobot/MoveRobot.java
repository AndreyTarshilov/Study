package RemoteMoveRobot;

public class MoveRobot  {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        for (int i=0; i<3; i++) {
            robotConnectionManager.getConnection();

            if(0 == 0) {
                throw new RobotConnectionException("Another exception");
                //moveRobotTo();

            }

        }
        // your implementation here
    }


}
