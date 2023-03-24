package org.stepic.java.Lesson3_3;

/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
Ось X смотрит слева направо, ось Y — снизу вверх. (Помните, как рисовали графики функций в школе?)
В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит:
вверх, вниз, направо или налево. Ваша задача — привести робота в заданную точку игрового поля.
Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация вам неизвестна):
 */
public class Robot {

    int X = 0;
    int Y = 0;

    Direction dir = Direction.UP;

    public Direction getDirection() {
        return dir;
        // текущее направление взгляда
    }

    public int getX() {
        return X;
        // текущая координата X
    }

    public int getY() {
        return Y;
        // текущая координата Y
    }

    public void turnLeft() {
        switch (dir) {
            case UP:
                dir = Direction.LEFT;
                break;
            case LEFT:
                dir = Direction.DOWN;
                break;
            case DOWN:
                dir = Direction.RIGHT;
                break;
            case RIGHT:
                dir = Direction.UP;
                break;
            // повернуться на 90 градусов против часовой стрелки
        }
    }

    public void turnRight() {
        switch (dir) {
            case UP:
                dir = Direction.RIGHT;
                break;
            case RIGHT:
                dir = Direction.DOWN;
                break;
            case DOWN:
                dir = Direction.LEFT;
                break;
            case LEFT:
                dir = Direction.UP;
                break;
        }
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (dir) {
            case UP:
                Y += 1;
                break;
            case DOWN:
                Y -= 1;
                break;
            case RIGHT:
                X += 1;
                break;
            case LEFT:
                X -= 1;
                break;
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT;

        /*public int ordinal(int i) {
            return 0;
        }*/
    }

    public static int finalDirection;
    public static int finalX;
    public static int finalY;


    public static void moveRobot(Robot robot, int toX, int toY) {
        // your implementation here
        /* Узнаем стартовую позицию робота */
        if (robot.getX()<toX) { // если робот справа от финальной точки, то...
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight(); // то поворачиваем его голову направо
            }
        }
        else if (robot.getX() == toX) { // если абсцисса робота совпадает с финальной, то...
             toX = robot.getX(); // то присваиваем его горизонтальной координате, начальное значение
        }
        else {
            while (robot.getDirection() != Direction.LEFT) { // если робот слева от финальной точки, то...
                robot.turnLeft(); // поворачиваем его голову налево
            }
        }


        /* for (int i = 0; i < Math.abs(toX - robot.getX()); i++) {
            robot.stepForward();
        } */
        // через длину отрезка робота передвинуть не удалось

        while (robot.getX() != toX) { // шагаем робота, пока абсцисса не совпадет
            robot.stepForward();
        }

        if (robot.getY()<toY) { // если робот сверху от финальной точки, то...
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight(); // то поворачиваем его голову вверх
            }
        }
        else if (robot.getY() == toY) { // если ордината робота совпадает с финальной, то...
            toY = robot.getY(); // то присваиваем его вертикальной координате, начальное значение
        }
        else {
            while (robot.getDirection() != Direction.DOWN) { // если робот снизу от финальной точки, то...
                robot.turnLeft(); // поворачиваем его голову вниз
            }
        }

        /* for (int i = 0; i < Math.abs(toY - robot.getY()); i++) {
            robot.stepForward();
        } */

        while (robot.getY() != toY) { // шагаем робота, пока ордината не совпадет
            robot.stepForward();
        }
        // public static final int finalDirection;
        // Direction dirFinal = robot.getDirection();
        // finalDirection = dirFinal; // финальное направление головы робота
        // System.out.println(dirFinal);
        finalX = toX; // финальная координата X робота
        finalY = toY; // финальная координата Y робота

    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.X =  - 2;
        robot.Y =  - 7;
        // int finalDirection = robot.dir.UP.ordinal();
        moveRobot(robot, robot.X, robot.Y);
        Direction dirFinal = robot.getDirection();
        System.out.println(dirFinal); // голова всегда смортит вверх!
        System.out.println();
        System.out.println(finalX); // robot.X совпрадает с finalX
        System.out.println(finalY); // robot.Y совпрадает с finalY

        //robot.moveRobot(robot.dir.ordinal., 3,6);
    }
}


