package org.stepic.java.Lesson4_2.RemoteMoveRobot;

import java.util.logging.Logger;

public class MoveRobot {
    private static final Logger log = Logger.getLogger("MoveRobot");

    public static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
        int tryCount = 0;
        boolean done = false;

        for (tryCount =0; tryCount<3 && !done; tryCount++) {
            try (RobotConnection robotConnection = robotConnectionManager.getConnection()) {
                robotConnection.moveRobotTo(toX, toY);
                done = true;
            } catch (RobotConnectionException e) {
                log.warning(e.getMessage());
            }
        }

        if (!done) {
            throw new RobotConnectionException("Connection failed after 3 attempts.");
        }
    }

    public static class RobotConnectionImpl implements RobotConnection {
        private static int connectionCount = 0;
        private int tryBeforeSuccess;
        public RobotConnectionImpl(int tryBeforeSuccess) {
            this.tryBeforeSuccess = tryBeforeSuccess;
        }

        @Override
        public void moveRobotTo(int x, int y) {
            if (connectionCount < tryBeforeSuccess) {
                connectionCount++;
                throw new RobotConnectionException("Ошибка при попытке перемещения");
            }
            log.info(String.format("Успешно переместился в точку %s, %s", x, y));
        }
        @Override
        public void close() {
            log.info("Соединение закрыто");
        }
    }
}
