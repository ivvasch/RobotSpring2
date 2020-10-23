package ru.ivan.sony;

import ru.ivan.interfaces.Head;

public class SonyHead implements Head {
    @Override
    public void calc() {
        System.out.println("Thinking about Sony");
    }
}
