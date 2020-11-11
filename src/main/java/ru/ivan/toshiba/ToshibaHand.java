package ru.ivan.toshiba;

import ru.ivan.interfaces.Hand;
import ru.ivan.interfaces.Head;
import ru.ivan.main.MyBeanPostProcessor;

public class ToshibaHand implements Hand {
    @Override
    public void catchSomething() {
        System.out.println("Catching somethings from toshiba");
    }
}
