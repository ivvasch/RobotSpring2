package ru.ivan.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.ivan.robot.ModelT1000;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Object obj = context.getBean("t1000");
        if (obj instanceof ModelT1000) { 
            ModelT1000 t1000 = (ModelT1000) obj;
//            t1000.action();
            System.out.println(t1000 + " " + t1000.getHead());

            t1000 = (ModelT1000) context.getBean("t1000");
            System.out.println(t1000 + " " + t1000.getHead());

            t1000 = (ModelT1000) context.getBean("t1000");
            System.out.println(t1000 + " " + t1000.getHead());
        }

    }
}
