package org.stepic.java.Lesson3_4;

/* Дан класс org.stepic.java.Lesson3_4.ComplexNumber. Переопределите в нем методы equals() и hashCode() так, чтобы equals() сравнивал экземпляры
org.stepic.java.Lesson3_4.ComplexNumber по содержимому полей re и im, а hashCode() был бы согласованным с реализацией equals().
Реализация hashCode(), возвращающая константу или не учитывающая дробную часть re и im, засчитана не будет

Пример
org.stepic.java.Lesson3_4.ComplexNumber a = new org.stepic.java.Lesson3_4.ComplexNumber(1, 1);
org.stepic.java.Lesson3_4.ComplexNumber b = new org.stepic.java.Lesson3_4.ComplexNumber(1, 1);
// a.equals(b) must return true
// a.hashCode() must be equal to b.hashCode()

Подсказка 1. Поищите в классе java.lang.Double статический метод, который поможет в решении задачи. */
public final class ComplexNumber {
    private final double re;
    private final double im;

    public static void main(String[] args) {

        double a7 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        ComplexNumber a1 = new ComplexNumber(1.0, 11.1);
        ComplexNumber a2 = new ComplexNumber(a7, 11.1);
        ComplexNumber a3 = new ComplexNumber(1, 11.1);
        ComplexNumber a4 = new ComplexNumber(11, 1);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a1));
        System.out.println(a1.equals(a3));
        System.out.println(a1.equals(a4));

        System.out.println(a1.hashCode() == a2.hashCode());
        System.out.println(a3.hashCode() == a1.hashCode());
        System.out.println(a1.hashCode() == a4.hashCode());

        System.out.println(a7);

    }

    public ComplexNumber(double re, double im) {
        this.re = re; //this ссылка на объект
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null)||(obj.getClass() != this.getClass())) {
            return false;
        }

        ComplexNumber man = (ComplexNumber) obj;

        if (Double.compare(this.re, man.re) == 0 && Double.compare(this.im, man.im) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {

        int hash = 7;
        hash = 31 * hash + Double.valueOf(re).hashCode();
        hash = 31 * hash + Double.valueOf(im).hashCode();
        return hash;

    }

}
