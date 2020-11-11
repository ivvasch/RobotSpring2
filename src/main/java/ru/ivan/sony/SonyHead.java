package ru.ivan.sony;

import ru.ivan.interfaces.Head;
import ru.ivan.main.MyBeanPostProcessor;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Sony");
    }
}
