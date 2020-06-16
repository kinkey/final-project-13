package com.project.dependecyinjection;

import com.project.basicDi.Bec;
import com.project.dixml.Car;

import java.lang.reflect.InvocationTargetException;

public class ContextuMeuRunner {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        ContextuMeu context = new ContextuMeu();

        Object specialCar = context.getBean("specialCar", Car.class);

        System.out.println(specialCar);

        Object specialCar1 = context.getBean("specialCar", Car.class);

        Object anotherCar = context.getBean("anotherCar", Car.class);

        Object someBec = context.getBean("becLuxten", Bec.class);

        System.out.println(someBec);
        System.out.println(anotherCar);

        System.out.println(specialCar1);

        System.out.println(context.getContextBeans());

    }
}
