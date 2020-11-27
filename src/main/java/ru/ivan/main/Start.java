package ru.ivan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ivan.interfaces.Robot;
import ru.ivan.interfaces.RobotConveyor;
import ru.ivan.pool.T1000Pool;
import ru.ivan.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("all-context.xml");
//        Object obj = context.getBean("t1000");
//        ModelT1000 t1000 = (ModelT1000) obj;
//        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");
//
//        Robot terminator1 = t1000Conveyor.createRobot();
//        Robot terminator2 = t1000Conveyor.createRobot();
//        Robot terminator3 = t1000Conveyor.createRobot();
//
//        System.out.println("terminator1 " + terminator1);
//        System.out.println("terminator2 " + terminator2);
//        System.out.println("terminator3 " + terminator3);
//
//        t1000.action();
        T1000Pool t1000Pool = (T1000Pool) context.getBean("t1000Pool");
        t1000Pool.action();
    }
}
