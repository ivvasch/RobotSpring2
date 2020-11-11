package ru.ivan.conveyor;

import ru.ivan.interfaces.Robot;
import ru.ivan.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {
    @Override
    public abstract Robot createRobot();
}
