/* Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале
по формуле левых прямоугольников.
Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator.
Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
Интервал интегрирования задается его конечными точками a и b, причем a<=b. Для получения достаточно точного результата
используйте шаг сетки не больше 10^(-6).

Пример. Вызов

integrate(x -> 1, 0, 10)
должен возвращать значение 10.

P.S.Если задача слишком легкая, то дополнительно можете реализовать динамический выбор шага сетки по следующему алгоритму:
1. Вычислить приближенное значение интеграла функции при начальном значении шага сетки (например, 1).
2. Вычислить приближенное значение интеграла функции при более мелком шаге сетки.
3. Если разность двух последовательных приближений интеграла функции достаточно мала, то завершаем алгоритм
и возвращаем текущее приближение в качестве результата.
4. Иначе возвращаемся к шагу 2.
*/

package org.stepic.java.Lesson3_5.integration;

import java.util.function.DoubleUnaryOperator;

public class Integration {
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double result = 0;
        /* Stepic doesn't like following variable */
        double stepOfNetwork = Math.pow(10, -6); // The use of unnamed magic numbers in code hides the developers' intent
        int n = (int) ((b - a) / stepOfNetwork);
        double x = a;
        for (int i = 0; i < n - 1; i++) {
            result += stepOfNetwork * f.applyAsDouble(x);
            x += stepOfNetwork;
        }
        return result;
    }

    public static void main(String args[]) {
        DoubleUnaryOperator f = x -> Math.sin(x);
        double a = 0, b = 10;
        double integral = integrate(f, a, b);
        System.out.println(integral);
    }
}

