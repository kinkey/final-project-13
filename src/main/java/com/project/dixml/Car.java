package com.project.dixml;

import com.project.basicDi.Bec;
import com.project.basicDi.EnergieCuantica;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class Car {

    @Autowired
    private Bec beculMeu;
    //private Bec beculMeu = new Bec(new EnergieCuantica());


    public String name = "unNume222";

    public Car(String name) {
        this.name = name;
    }

    public Car() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "beculMeu=" + beculMeu +
                ", name='" + name + '\'' +
                '}';
    }
}
