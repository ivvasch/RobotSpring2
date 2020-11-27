package ru.ivan.pool;

import ru.ivan.interfaces.Robot;
import ru.ivan.interfaces.RobotPool;

import java.util.Collection;
import java.util.Map;

public class T1000Pool implements RobotPool {
    private Map<String, Robot> robotCollection;

    public T1000Pool(Map<String, Robot> robotCollection) {
        this.robotCollection = robotCollection;
    }

    @Override
    public Map<String, Robot> getRobotCollection() {
        return null;
    }

    public void action() {
        for (Map.Entry<String, Robot> robot : robotCollection.entrySet()) {
            System.out.println(robot.getKey());
            robot.getValue().action();
        }
    }
}
