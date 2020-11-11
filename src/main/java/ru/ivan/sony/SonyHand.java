package ru.ivan.sony;

import org.springframework.beans.BeansException;
import ru.ivan.interfaces.Hand;
import ru.ivan.main.MyBeanPostProcessor;

public class SonyHand implements Hand {


    @Override
    public void catchSomething() {
        System.out.println("Catching from Sony");
    }
}
