package org.stepic.java.Lesson4_1.Test;

public class Test {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }
    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        if (stackTraceElements.length < 4) {
            return null;
        } else {
            //StackTraceElement caller = stackTraceElements[3];
            return stackTraceElements[3].getClassName() + "#" + stackTraceElements[3].getMethodName();
        }
        //...
    }
}
