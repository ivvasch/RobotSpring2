package ru.ivan.robot;

import ru.ivan.interfaces.Hand;
import ru.ivan.interfaces.Head;
import ru.ivan.interfaces.Leg;
import ru.ivan.interfaces.Robot;

public abstract class BaseModel implements Robot {

    private Hand hand;
    private Leg leg;
    private Head head;

    public BaseModel() {
        System.out.println(this + " - BaseModel constructor()");
    }

    public BaseModel(Hand hand, Head head,  Leg leg) {
        this();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }
}
