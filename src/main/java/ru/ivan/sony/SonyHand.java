package ru.ivan.sony;

import ru.ivan.interfaces.Hand;

public class SonyHand implements Hand {

    @Override
    public void catchSomething() {
        System.out.println("Catching from Sony");
    }
}
