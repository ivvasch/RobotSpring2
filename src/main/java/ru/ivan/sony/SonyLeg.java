package ru.ivan.sony;

import ru.ivan.interfaces.Leg;
import ru.ivan.main.MyBeanPostProcessor;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Sony");
    }
}
