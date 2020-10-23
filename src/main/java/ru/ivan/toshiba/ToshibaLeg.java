package ru.ivan.toshiba;

import ru.ivan.interfaces.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Toshiba");
    }
}
