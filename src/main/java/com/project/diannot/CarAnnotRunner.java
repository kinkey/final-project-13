package com.project.diannot;

import com.project.dixml.Car;
import com.project.dixml.Parcare;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CarAnnotRunner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(CarConfiguration.class);

        Parcare parcare = context.getBean("parcare", Parcare.class);

        System.out.println(parcare);

        CarConfiguration cf1 = context.getBean("carConfiguration", CarConfiguration.class);

        CarConfiguration cff = new CarConfiguration();

        Car car = cff.primaMeaMasina();

        Car carFromContext = cf1.primaMeaMasina();

        System.out.println("masina din context:" + carFromContext);

        System.out.println("masina nu din context" + car);
    }
}
