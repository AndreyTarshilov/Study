package org.stepic.java.Lesson4_1.Test;

public class Test3 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        //StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        try {
            //RuntimeException exp = new RuntimeException();
            StackTraceElement element = new Throwable().getStackTrace()[2];
            return element.getClassName() + "#" + element.getMethodName();
        } catch (ArrayIndexOutOfBoundsException e) {
           return null;
        }
        //return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
    }
}


