package org.stepic.java.Lesson3_5.exstatic;

public class ExStatic { // external non-static class
    private static String HELLO; // creating static variable
    private String BAY = "bay"; // creating non-static variable
    private int a = 1; // variable a in external class

    static { // modifier static is existing by his own. It was crazy shock for me.
        HELLO = "Hello"; // A chto, tak MOZHNO bylo, chto li?
    }

    private static class H1 { // first internal static class
        private int a; // variable a in internal static class

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        } // void method is using variable a? Unbelievable
    }

    private class H2 { // second internal non-static class
        private int a; // variable a in internal non-static class

        public H2() {
            this.a = ExStatic.this.a;
        } // calling variable from external class

        public int getA() {
            return a;
        } // How is possible to use methods from another private class?

        public void setA(int a) {
            this.a = a;
        } // Maybe, these methods are own for class H2...
    }

    ExStatic() {
        super();
    } // What are hell is dich' dichaishaya? Which class is called? External class in external class? Or class Object?

    public static void main(String []args) {
        ExStatic s1 = new ExStatic();
        ExStatic s2 = new ExStatic();
        System.out.println(ExStatic.HELLO);
        String res1 = String.format("Before. s1. HELLO: %s, bay: %s. s2. HELLO: %s, bay: %s", ExStatic.HELLO,
                s1.BAY,
                s2.HELLO,
                s2.BAY);
        System.out.println(res1);
        s1.BAY = "good bay"; // non-static (horoshiy zaliv :-)) Please, don't change in program!
        s1.HELLO = "Hi"; // static
        System.out.println(String.format("After. s1. HELLO: %s, bay: %s. s2. HELLO: %s, bay: %s", ExStatic.HELLO, s1.BAY,
                HELLO,
                s2.BAY)); // "HELLO" has changed on "Hi". "bye" has changed on "good bye"
        H2 h3 = s2.new H2();
        s2.a = 10;
        s1.a = 5;
        H1 h1 = new ExStatic.H1();
        H2 h2 = s2.new H2();

        System.out.println("H1: " + h1.getA());
        System.out.println("H3: " + h3.getA());
        System.out.println("H2: " + h2.getA());

        Integer i1 = 1;
        Integer i2 = 1;

        Integer i3 = 100000;
        Integer i4 = 100000;

        System.out.println(" " + (i1 == i2) + " " + (i3 == i4) + " " + (i3.equals(i4))); // absolutely clear for me
        /* Thank you for your job! */
    }
}

