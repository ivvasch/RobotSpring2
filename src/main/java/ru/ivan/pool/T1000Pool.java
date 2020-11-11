package ru.ivan.pool;

import ru.ivan.interfaces.Robot;
import ru.ivan.interfaces.RobotPool;

import java.util.Collection;

public class T1000Pool implements RobotPool {
    private Collection<Robot> robotCollection;

    public void setRobotCollection(Collection<Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Collection<Robot> getRobotCollection() {
        return null;
    }

    public void action() {
        for (Robot robot : robotCollection) {
            robot.action();
        }
    }
}
