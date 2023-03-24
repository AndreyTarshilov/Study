package org.stepic.java.Lesson2_4;

import java.math.BigInteger;

/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */
/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал NN вычисляется как 1 \cdot 2 \cdot ... \cdot N1⋅2⋅...⋅N.
Поскольку это очень быстро растущая функция, то даже для небольших NN вместимости типов int и long очень скоро не хватит.
Поэтому будем использовать BigInteger. Воспользуйтесь предоставленным шаблоном. Декларацию класса,
метод main и обработку ввода-вывода добавит проверяющая система.
*/
public class Factorial {
    public static BigInteger factorial(int value) {
        BigInteger fact = new BigInteger("1"); // factorial should be class of BigInteger
        for (int i=1; i <= value; i++) { // factorial is determined by the size of the loop
            fact = fact.multiply(BigInteger.valueOf(i)); // loop for finding factorial
        }
        return fact;
    }

    public static void main(String[] args) {
        int value = 100; // enter the number whose factorial you want to find
        BigInteger x = factorial(value);
        System.out.println("Factorial of " + value + " is " + x);
    }
}
