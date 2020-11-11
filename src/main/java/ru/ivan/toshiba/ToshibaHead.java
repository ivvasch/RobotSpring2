package ru.ivan.toshiba;

import ru.ivan.interfaces.Head;
import ru.ivan.main.MyBeanPostProcessor;

public class ToshibaHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Toshiba");
    }
}
