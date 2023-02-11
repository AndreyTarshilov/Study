package org.stepic.java.exstatic;

public class ExStatic {
    private static String HELLO;
    private String BAY = "bay";
    private int a = 1;

    static {
        HELLO = "Hello";
    }

    private static class H1 {
        private int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    private class H2 {
        private int a;

        public H2() {
            this.a = ExStatic.this.a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }

    ExStatic() {
        super();
    }

    public static void main(String []args) {
        ExStatic s1 = new ExStatic();
        ExStatic s2 = new ExStatic();
        System.out.println(ExStatic.HELLO);
        String res1 = String.format("Before. s1. HELLO: %s, bay: %s. s2. HELLO: %s, bay: %s", ExStatic.HELLO,
                s1.BAY,
                s2.HELLO,
                s2.BAY);
        System.out.println(res1);
        s1.BAY = "good bay";
        s1.HELLO = "Hi";
        System.out.println(String.format("After. s1. HELLO: %s, bay: %s. s2. HELLO: %s, bay: %s", ExStatic.HELLO, s1.BAY,
                HELLO,
                s2.BAY));
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

        System.out.println(" " + (i1 == i2) + " " + (i3 == i4) + " " + (i3.equals(i4)));

    }
}
