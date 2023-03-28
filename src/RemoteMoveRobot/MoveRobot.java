package RemoteMoveRobot;

public class MoveRobot  {
    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

        for (int i=0; i<3; i++) {
            robotConnectionManager.getConnection();

            if(0 == 0) {
                // robotConnectionManager (RobotConnection, );
              /*  @Override
                void close();*/
                throw new RobotConnectionException("Another exception");

            }

        }
        // your implementation here
    }


}
