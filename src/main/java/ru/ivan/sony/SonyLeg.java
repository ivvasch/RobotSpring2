package ru.ivan.sony;

import ru.ivan.interfaces.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Sony");
    }
}
