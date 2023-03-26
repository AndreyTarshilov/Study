/* Рассмотрим пример кода:
    try {
      // ...
    } catch (Exception e) {
      // ...
    } finally {
      // ...
    }
При каких условиях блок finally не будет выполнен? Можно выбрать несколько вариантов.
Выберите все подходящие ответы из списка

1. Если в блоке catch при обработке исключения случилось другое исключение.
2. Если в блоке try выполняется оператор return.
3. Если в блоке try выполняется оператор break.
4. Если в блоке try вызван System.exit(0).
5. Если во время исполнения блока try виртуальная машина "выполнила недопустимую операцию и будет закрыта".
6. Если в блоке try брошено исключение, которое обработано блоком catch.*/

package org.stepic.java.Lesson4_2.PossibilitiesForFinally;

public class PossibilitiesForFinally {

    public void test1()  {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("test1 catch");
            throw new RuntimeException();
        } finally {
            System.out.println("Finally 1 is done");
        }
    }
    public void test2()  {
        try {
            return;
        } catch (RuntimeException e) {

        } finally {
            System.out.println("Finally 2 is done");
        }
    }
    public void test3()  {
        for(;;) {
            try {
                break;
            } catch (RuntimeException e) {

            } finally {
                System.out.println("Finally 3 is done");
            }
        }
    }
    public void test4()  {
        try {
            System.exit(0);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("Finally 4 is done");
        }
    }
    public void test5()  {
        try {
            for(;;) {
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.println("Finally 5 is done");
        }
    }
    public void test6()  {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.out.println("Exception was checked");
        } finally {
            System.out.println("Finally 6 is done");
        }
    }

    public static void main(String[] args) {
        PossibilitiesForFinally possible = new PossibilitiesForFinally();
        try {possible.test1();
        }
        catch (RuntimeException e) {}
        possible.test2();
        possible.test3();
        //possible.test4();
        possible.test5();
        possible.test6();
    }
    }
