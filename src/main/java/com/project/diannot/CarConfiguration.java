package com.project.diannot;

import com.project.dixml.Car;
import com.project.dixml.Parcare;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("com.project")
public class CarConfiguration {

    @Bean
    public Car primaMeaMasina(){
        Car car = new Car();
        car.setName("bemeve");
        return car;
    }

    @Bean
    public Car aDouaMasina(){
        Car car = new Car();
        car.setName("mercedes");
        return car;
    }

    @Bean
    public List<Car> getCars(){
        List<Car> c = new ArrayList<Car>();
        c.add(primaMeaMasina());
        c.add(aDouaMasina());
        return  c;
    }




    @Bean
    public Parcare parcare(){
        return new Parcare();
    }



}
