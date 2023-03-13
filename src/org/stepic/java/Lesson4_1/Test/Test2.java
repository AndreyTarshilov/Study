package org.stepic.java.Lesson4_1.Test;

import java.util.Optional;

public class Test2 {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    private static String getCallerClassAndMethodName() {
        StackWalker walker = StackWalker.getInstance(StackWalker.Option.RETAIN_CLASS_REFERENCE);
        // skip the getCallerClassAndMethodName and the method that called it
        Optional<StackWalker.StackFrame> frame = walker.walk(frames -> frames.skip(2).findFirst());
        if (frame.isPresent()) {
            StackWalker.StackFrame f = frame.get();
            return f.getDeclaringClass().getName() + "#" + f.getMethodName();
        } else {
            return null;
        }
    }
}