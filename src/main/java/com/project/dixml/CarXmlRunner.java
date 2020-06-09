package com.project.dixml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarXmlRunner {

    public static void main(String[] args) {
        //todo load based on env
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("carContext.xml");

        //Car firstCar = new Car();
        //Car fristCar2 = new Car();

        Car primameaMasina = context.getBean("primaMeaMasina", Car.class);
        Car primameaMasina2 = context.getBean("primaMeaMasina2", Car.class);
        Car primameaMasina22 = context.getBean("primaMeaMasina2", Car.class);
        Car primameaMasina23 = context.getBean("primaMeaMasina2", Car.class);

        System.out.println(primameaMasina);

        System.out.println(primameaMasina2);
        System.out.println(primameaMasina22);
        System.out.println(primameaMasina23);
    }
}
