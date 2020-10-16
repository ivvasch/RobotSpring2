package ru.ivan.robot;

import ru.ivan.interfaces.Hand;
import ru.ivan.interfaces.Head;
import ru.ivan.interfaces.Leg;
import ru.ivan.interfaces.Robot;

public class ModelT1000 implements Robot {
    private Hand hand;
    private Head head;
    private Leg leg;

    public ModelT1000(Hand hand, Head head, Leg leg) {
        super();
        this.hand = hand;
        this.head = head;
        this.leg = leg;
    }

    public ModelT1000() {

    }

    @Override
    public void fire() {
        head.calc();
        hand.catchSomething();
        leg.go();

    }

    @Override
    public void dance() {
        System.out.println("T1000 is dansing");

    }
}
