package ru.ivan.robot;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

public class ActionRaplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("New action doing");
        return null;
    }
}
